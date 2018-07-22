package com.aasis21.app;

import org.eclipse.jdt.core.dom.*;
import java.io.File;
import java.io.FileWriter;  
import java.io.IOException;


class AstToDot extends ASTVisitor {
	String dotfile;
	
	AstToDot(String filename ){
        this.dotfile = filename + ".txt";
    }
	
	public void preVisit(ASTNode node) {
		String to_write = "";
		boolean to_append = true;
		if(node.getNodeType() == 15){
			// CompilationUnit 
			to_write += "digraph G {\n";
			to_write  += Integer.toString(node.hashCode()) + "[label=\"" + node.nodeClassForType(node.getNodeType()).getName().replace("org.eclipse.jdt.core.dom.", "")  + "\"]" ;
			to_append = false;
		}else{
		    to_write += Integer.toString(node.hashCode()) + "[label=\"" ;
			to_write += node.nodeClassForType(node.getNodeType()).getName().replace("org.eclipse.jdt.core.dom.", "");
	
			StructuralPropertyDescriptor des = (StructuralPropertyDescriptor) node.structuralPropertiesForType().get(0);
			if(des.isSimpleProperty()){
				to_write = to_write + "\\n" + node.getStructuralProperty(des).toString();
			}
			to_write += "\"]\n";
			ASTNode parent_node = node.getParent();
	        to_write += Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "\n";
		} 
		
		System.out.println(to_write);		
		File file = new File(dotfile);
	    FileWriter writer = null;
	    try {
	        writer = new FileWriter(file, to_append);
	        writer.write(to_write);
	    } catch (IOException e) {
	        e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
	    } finally {
	        if (writer != null) try { writer.close(); } catch (IOException ignore) {}
	    } 
	}
	
	public void endVisit(CompilationUnit node) {
		File file = new File(dotfile);
	    FileWriter writer = null;
	    try {
	        writer = new FileWriter(file, true);
	        writer.write("\n}");
	    } catch (IOException e) {
	        e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
	    } finally {
	        if (writer != null) try { writer.close(); } catch (IOException ignore) {}
	    }
	    
	    System.out.printf("File is located at %s%n", file.getAbsolutePath());
	}

    /**
     * Starts the process.
     *
     * @param unit
     *            the AST root node. Bindings have to have been resolved.
     */
    public void generate(CompilationUnit unit) {
		unit.accept(this);
	}

}

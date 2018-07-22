package com.aasis21.app;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IfStatement;



public class IfFinderVisitor extends ASTVisitor{
	
	public boolean visit(IfStatement node) {
		System.out.println("If Statement Found:" + node.getStartPosition());
		return true;
	}

	 public void generate(CompilationUnit unit) {
			unit.accept(this);
	}
	

}

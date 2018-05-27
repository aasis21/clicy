
package com.aasis21.app;



import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;


import org.eclipse.jdt.core.dom.*;


class AstToDot extends ASTVisitor {

	// Creating a File object that represents the disk file.
    //PrintStream dot_file = new PrintStream(new File("dot_file.dot"));

    // Store current System.out before assigning a new value
    // PrintStream console = System.out;

    // Assign o to output stream
   // System.setOut(dot_file);

	public boolean visit(AnnotationTypeDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"AnnotationTypeDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] ");
		return true;
	}


	public boolean visit(AnnotationTypeMemberDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"AnnotationTypeMemberDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] ");
		return true;
	}


	public boolean visit(AnonymousClassDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"AnonymousClassDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] ");
		return true;
	}

	public boolean visit(ArrayAccess node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ArrayAccess" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ArrayCreation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ArrayCreation" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(ArrayInitializer node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ArrayInitializer" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ArrayType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ArrayType" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(AssertStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(Assignment node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"Assignment" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(Block node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(BlockComment node) {
		 return false;
	}

	public boolean visit(BooleanLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(BreakStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(CastExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(CatchClause node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(CharacterLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ClassInstanceCreation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ClassInstanceCreation" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(CompilationUnit node) {
		System.out.println("digraph G {");
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"CompilationUnit" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"]");
		return true;
	}

	public boolean visit(ConditionalExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ConditionalExpression" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ConstructorInvocation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ContinueStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(CreationReference node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(Dimension node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(DoStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(EmptyStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(EnhancedForStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(EnumConstantDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(EnumDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

//	public boolean visit(ExportsDirective node) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}

	public boolean visit(ExpressionMethodReference node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ExpressionMethodReference" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ExpressionStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(FieldAccess node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(FieldDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ForStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(IfStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"IfStatement" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ImportDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ImportDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(InfixExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(Initializer node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(InstanceofExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(IntersectionType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(Javadoc node) {
		// visit tag elements inside doc comments only if requested
		return false;
	}

	public boolean visit(LabeledStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(LambdaExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(LineComment node) {
	 	return false;
	}

	public boolean visit(MarkerAnnotation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(MemberRef node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(MemberValuePair node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(MethodRef node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(MethodRefParameter node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"MethodRefParameter" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(MethodDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"MethodDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(MethodInvocation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"MethodInvocation" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(Modifier node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

//	public boolean visit(ModuleDeclaration node) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}
//
//	public boolean visit(ModuleModifier node) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}

	public boolean visit(NameQualifiedType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(NormalAnnotation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(NullLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(NumberLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"NumberLiteral" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

//	public boolean visit(OpensDirective node) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}


	public boolean visit(PackageDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(ParameterizedType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ParenthesizedExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(PostfixExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(PrefixExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


//	public boolean visit(ProvidesDirective node) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}

//	public boolean visit(PrimitiveTypenode) {
//		System.out.println(Integer.toString(node.hashCode()) + "[label=\"PrimitiveType" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
//	}

	public boolean visit(QualifiedName node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(QualifiedType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	//public boolean visit(RequiresDirective node) {
	//	System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	//}

	public boolean visit(ReturnStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"ReturnStatement" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SimpleName node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"SimpleName" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SimpleType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"SimpleType" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SingleMemberAnnotation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	public boolean visit(SingleVariableDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"SingleVariableDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(StringLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"StringLiteral" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SuperConstructorInvocation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"SuperConstructorInvocation" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SuperFieldAccess node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SuperMethodInvocation node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SuperMethodReference node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SwitchCase node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SwitchStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(SynchronizedStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TagElement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TextElement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ThisExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(ThrowStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TryStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TypeDeclaration node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"TypeDeclaration" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TypeDeclarationStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TypeLiteral node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TypeMethodReference node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(TypeParameter node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(UnionType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	/*
	public boolean visit(UsesDirective node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}
   */
	public boolean visit(VariableDeclarationExpression node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"VariableDeclarationExpression" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(VariableDeclarationStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"VariableDeclarationStatement" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(VariableDeclarationFragment node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"VariableDeclarationFragment" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(WhileStatement node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}

	public boolean visit(WildcardType node) {
		System.out.println(Integer.toString(node.hashCode()) + "[label=\"" + node.structuralPropertiesForType().toArray()[0] + node.toString() + "\"] "); return true;
	}


	/**
 	* End of visit the given type-specific AST node.
 	* <p>
 	* The default implementation does nothing. Subclasses may reimplement.
 	* </p>
 	*
 	* @param node the node to visit
 	* @since 3.1
 	*/

    public void endVisit(AnnotationTypeDeclaration node) {
		ASTNode parent_node = node.getParent();
		System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(AnnotationTypeMemberDeclaration node) {
		ASTNode parent_node = node.getParent();
		System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(AnonymousClassDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ArrayAccess node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ArrayCreation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ArrayInitializer node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ArrayType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(AssertStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Assignment node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Block node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	/**
	 * End of visit the given type-specific AST node.
	 * <p>
	 * The default implementation does nothing. Subclasses may reimplement.
	 * </p>
	 * <p>Note: {@link LineComment} and {@link BlockComment} nodes are
	 * not considered part of main structure of the AST. This method will
	 * only be called if a client goes out of their way to visit this
	 * kind of node explicitly.
	 * </p>
	 *
	 * @param node the node to visit
	 * @since 3.0
	 */
	public void endVisit(BlockComment node) {

	}

	public void endVisit(BooleanLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(BreakStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(CastExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(CatchClause node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(CharacterLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}


	public void endVisit(ClassInstanceCreation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(CompilationUnit node) {
          //ASTNode parent_node = node.getParent();
          //System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
		  System.out.println("}");
	}

	public void endVisit(ConditionalExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ConstructorInvocation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ContinueStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(CreationReference node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(DoStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(EmptyStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(EnhancedForStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(EnumConstantDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(EnumDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}



	public void endVisit(ExpressionMethodReference node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ExpressionStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Dimension node) {
		// do nothing by default
	}

	public void endVisit(FieldAccess node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(FieldDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ForStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(IfStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ImportDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(InfixExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(InstanceofExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Initializer node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Javadoc node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(LabeledStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(LambdaExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	/**
	 * End of visit the given type-specific AST node.
	 * <p>
	 * The default implementation does nothing. Subclasses may reimplement.
	 * </p>
	 * <p>Note: {@link LineComment} and {@link BlockComment} nodes are
	 * not considered part of main structure of the AST. This method will
	 * only be called if a client goes out of their way to visit this
	 * kind of node explicitly.
	 * </p>
	 *
	 * @param node the node to visit
	 * @since 3.0
	 */
	public void endVisit(LineComment node) {

	}

	public void endVisit(MarkerAnnotation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MemberRef node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MemberValuePair node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MethodRef node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MethodRefParameter node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MethodDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(MethodInvocation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(Modifier node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	
	

	public void endVisit(NameQualifiedType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(NormalAnnotation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(NullLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(NumberLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}



	public void endVisit(PackageDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ParameterizedType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ParenthesizedExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(PostfixExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(PrefixExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(PrimitiveType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}



	public void endVisit(QualifiedName node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(QualifiedType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}


	public void endVisit(ReturnStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SimpleName node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SimpleType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SingleMemberAnnotation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SingleVariableDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(StringLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SuperConstructorInvocation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SuperFieldAccess node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SuperMethodInvocation node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SuperMethodReference node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SwitchCase node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SwitchStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(SynchronizedStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TagElement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TextElement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ThisExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(ThrowStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TryStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TypeDeclaration node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TypeDeclarationStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TypeLiteral node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TypeMethodReference node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(TypeParameter node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(UnionType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	
	public void endVisit(IntersectionType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(VariableDeclarationExpression node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(VariableDeclarationStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(VariableDeclarationFragment node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(WhileStatement node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
	}

	public void endVisit(WildcardType node) {
          ASTNode parent_node = node.getParent();
          System.out.println(Integer.toString(parent_node.hashCode()) + "->" + Integer.toString(node.hashCode()) + "" );
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

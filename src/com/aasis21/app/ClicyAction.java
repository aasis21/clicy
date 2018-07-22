package com.aasis21.app;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.aasis21.app.AstToDot;

/**
 * The action delegate for both actions "Change Method Visability" and "Move
 * Method Declaration".
 * <p>
 * Project page: <a target="_blank"
 * href="http://sourceforge.net/projects/earticleast">http://sourceforge.net/projects/earticleast</a>
 * </p>
 *
 * @author Thomas Kuhn
 *
 */
public class ClicyAction implements IObjectActionDelegate {

	private ISelection selection;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			ICompilationUnit fileUnit = (ICompilationUnit) ((IStructuredSelection) selection)
					.getFirstElement();
			createActionExuecutable(action.getId(),fileUnit);
		}

	}
	
	private void createActionExuecutable(String id,ICompilationUnit fileUnit) {
		if ("com.aasis21.app.ASTAction".equals(id)){
			CompilationUnit unit = parse(fileUnit);
			AstToDot dotfile = new AstToDot(fileUnit.getElementName());
			dotfile.generate(unit);
		}
		else if("com.aasis21.app.IFFINDER".equals(id)){
			CompilationUnit unit = parse(fileUnit);
			IfFinderVisitor if_finder = new IfFinderVisitor();
			if_finder.generate(unit);
		}
		else {
			throw new IllegalArgumentException(id);
		}
	}
	

	protected CompilationUnit parse(ICompilationUnit fileUnit) {
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(fileUnit); // set source
		parser.setResolveBindings(true); // we need bindings later on
		return (CompilationUnit) parser.createAST(null /* IProgressMonitor */); // parse
	}	

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}

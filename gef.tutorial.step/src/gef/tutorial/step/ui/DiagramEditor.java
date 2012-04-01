package gef.tutorial.step.ui;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.model.HelloModel;
import gef.tutorial.step.parts.PartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

public class DiagramEditor extends GraphicalEditor {
	
	public static final String ID = "gef.tutorial.step.ui.DiagramEditor";
	
	GraphicalViewer viewer;
	
	public DiagramEditor(){
		setEditDomain(new DefaultEditDomain(this));
	}
	
	
	
	@Override
	protected void configureGraphicalViewer() {
		// TODO Auto-generated method stub
		super.configureGraphicalViewer();
		viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new PartFactory());
	}



	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
//		viewer.setContents(new HelloModel());
		GraphicalViewer viewer = getGraphicalViewer();
		ContentsModel parent = new ContentsModel();
		HelloModel child = new HelloModel();
		child.setContraint(new Rectangle(0,0,-1,-1));
		parent.addChild(child);
		
		HelloModel child1 = new HelloModel();
		child1.setContraint(new Rectangle(30,30,-1,-1));
		parent.addChild(child1);
		
		HelloModel child2 = new HelloModel();
		child2.setContraint(new Rectangle(10,80,80,50));
		parent.addChild(child2);
		
		viewer.setContents(parent);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		super.doSaveAs();
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return super.isSaveAsAllowed();
	}

	
}

package gef.tutorial.step.parts;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.policy.CustomXYLayoutEditPolicy;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class ContentEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		Layer figure = new Layer();
		figure.setLayoutManager(new XYLayout());
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.LAYOUT_ROLE,new CustomXYLayoutEditPolicy());
	}
	protected List getModelChildren(){
		return ((ContentsModel)getModel()).getChildren();
	}
	

}

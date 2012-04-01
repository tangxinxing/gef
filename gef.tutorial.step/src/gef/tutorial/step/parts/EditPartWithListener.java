package gef.tutorial.step.parts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import gef.tutorial.step.model.AbstractModel;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class EditPartWithListener extends AbstractGraphicalEditPart implements
		PropertyChangeListener {

	
	
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		super.activate();
		((AbstractModel)getModel()).addPropertyChangeListener(this);
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		super.deactivate();
		((AbstractModel)getModel()).removePropertyChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}

package gef.tutorial.step.parts;

import java.beans.PropertyChangeEvent;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;


public class HelloEditorPart extends EditPartWithListener {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		HelloModel model = (HelloModel)getModel();
		Label label = new Label();
		label.setText(model.getText());
		
		label.setBorder(new CompoundBorder(new LineBorder(),new MarginBorder(3)));
		label.setBackgroundColor(ColorConstants.orange);
		label.setOpaque(true);
		return label;
	}


	//…Ë÷√‘º ¯
	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		Rectangle constraint = ((HelloModel)getModel()).getContraint();
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), constraint);
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
//		super.propertyChange(evt);
		if(event.getPropertyName().equals(HelloModel.P_CONSTRAINT)){
			refreshVisuals();
		}
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}

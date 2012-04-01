package gef.tutorial.step;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class ChangeConstraintCommand extends Command {
	private HelloModel helloModel;
	private Rectangle constraint;
	private Rectangle oldConstraint;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		helloModel.setContraint(constraint);
	}
	public void setConstraint(Rectangle rect){
		constraint = rect;
		oldConstraint = helloModel.getContraint();
	}
	
	public void setModel(Object model){
		helloModel = (HelloModel)model;
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		helloModel.setContraint(oldConstraint);
	}
	
	
}

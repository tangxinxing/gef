package gef.tutorial.step.policy;

import gef.tutorial.step.ChangeConstraintCommand;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class CustomXYLayoutEditPolicy extends XYLayoutEditPolicy {
	
	
	
	
	
	@Override
	public Command getCommand(Request request) {
		// TODO Auto-generated method stub
		System.out.println(request.getType());
		return super.getCommand(request);
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command createAddCommand(EditPart child, Object constraint) {
		// TODO Auto-generated method stub
		return super.createAddCommand(child, constraint);
	}

	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		// TODO Auto-generated method stub
		ChangeConstraintCommand command = new ChangeConstraintCommand();
		command.setModel(child.getModel());
		command.setConstraint((Rectangle)constraint);
		return command;
	}

	@Override
	protected Command getDeleteDependantCommand(Request request) {
		// TODO Auto-generated method stub
		return super.getDeleteDependantCommand(request);
	}
	
	

}

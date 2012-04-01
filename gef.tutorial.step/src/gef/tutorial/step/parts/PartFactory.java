package gef.tutorial.step.parts;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class PartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		EditPart part = getPartForElement(model);
		part.setModel(model);
		return part;
	}

	private EditPart getPartForElement(Object model) {
		if(model instanceof HelloModel){
			return new HelloEditorPart();
		}else if(model instanceof ContentsModel){
			return  new ContentEditPart();
		}
		throw new RuntimeException("Can't create part for model element:"+((model != null) ? model.getClass().getName() : "null"));
		
		
	}
	
}

package gef.tutorial.step.model;

import java.util.ArrayList;
import java.util.List;

public class ContentsModel{
	private List children= new ArrayList();
	
	public void addChild(Object child){
		children.add(child);
	}
	public List getChildren(){
		return children;
	}
}

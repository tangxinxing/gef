package gef.tutorial.step.model;

import org.eclipse.draw2d.geometry.Rectangle;

public class HelloModel extends AbstractModel{
	private String text = "Hello World";
	private Rectangle contraint;
	
	public static final String P_CONSTRAINT = "_constraint";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Rectangle getContraint() {
		return contraint;
	}

	public void setContraint(Rectangle rect) {
		contraint = rect;
		firePropertyChange(P_CONSTRAINT,null,contraint);
	}
	
	
}

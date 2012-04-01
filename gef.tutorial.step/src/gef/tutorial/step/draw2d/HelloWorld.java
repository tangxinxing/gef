package gef.tutorial.step.draw2d;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Label;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;



public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display d = new Display();
		Shell shell = new Shell(d);
		shell.setLayout(new FillLayout());
		FigureCanvas canvas = new FigureCanvas(shell);
		canvas.setContents(new Label("hello world"));
		shell.setText("draw2d");
		shell.open();
		while(!shell.isDisposed()){
			if(!d.readAndDispatch()){
				d.sleep();
			}
		}
		
	}

}

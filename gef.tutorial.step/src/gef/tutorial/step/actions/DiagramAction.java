package gef.tutorial.step.actions;

import gef.tutorial.step.Application;
import gef.tutorial.step.ui.DiagramEditor;
import gef.tutorial.step.ui.DiagramEditorInput;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;


public class DiagramAction extends Action implements ISelectionListener,IWorkbenchAction {

	private final IWorkbenchWindow window;
	public final static String ID = "gef.step.diagram";
	private IStructuredSelection selection;
	
	public DiagramAction(IWorkbenchWindow window){
		this.window = window;
		setId(ID);
		setText("&Diagram");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID, "icons/alt_window_16.gif"));
		window.getSelectionService().addSelectionListener(this);
	}
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		window.getSelectionService().removeSelectionListener(this);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String path = openFileDialog();
		if(path != null){
			IEditorInput input = new DiagramEditorInput(new Path(path));
			IWorkbenchPage page = window.getActivePage();
			try {
				page.openEditor(input, DiagramEditor.ID,true);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private String openFileDialog() {
		// TODO Auto-generated method stub
		FileDialog dialog = new FileDialog(window.getShell(),SWT.OPEN);
		dialog.setText("GEFÎÄ¼þ");
		
		return dialog.open();
	}

	
}

package gef.tutorial.step;



import gef.tutorial.step.actions.DiagramAction;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
//添加前面创建的DiagramAction
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IWorkbenchAction exitAction;
	private IWorkbenchAction aboutAction;
	private DiagramAction diagramAction;
	private IWorkbenchAction backAction;

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	exitAction = ActionFactory.QUIT.create(window);
    	register(exitAction);
    	aboutAction = ActionFactory.ABOUT.create(window);
    	register(aboutAction);
    	backAction = ActionFactory.BACK.create(window);
    	register(backAction);
    	diagramAction = new DiagramAction(window);
    	register(diagramAction);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    	MenuManager fileMenu = new MenuManager("&File","File");
    	fileMenu.add(diagramAction);
    	fileMenu.add(new Separator());
    	fileMenu.add(exitAction);

    	MenuManager helpMenu = new MenuManager("&Help","help");
    	helpMenu.add(aboutAction);
    	
    	MenuManager toolsMenu = new MenuManager("&Tools","Tools");
    	toolsMenu.add(backAction);
    	
    	menuBar.add(fileMenu);
    	menuBar.add(helpMenu);
    	menuBar.add(toolsMenu);
    	
    }
    
}

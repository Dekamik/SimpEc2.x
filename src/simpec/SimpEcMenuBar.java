package simpec;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class SimpEcMenuBar extends JMenuBar {
	
	public JMenuItem newItem, loadItem, closeItem;
	public JMenuItem calculatorItem, calendarItem;
	public JMenuItem aboutItem;
	
	public SimpEcMenuBar() {
		super();
		add(createFileMenu());
		add(createToolsMenu());
		add(createHelpMenu());
	}
	
	private JMenu createFileMenu() {
		JMenu m = new JMenu("File");
		m.add(newItem = new JMenuItem("New"));
		m.add(loadItem = new JMenuItem("Load"));
		m.add(closeItem = new JMenuItem("Exit Program"));
		return m;
	}
	
	private JMenu createToolsMenu() {
		JMenu m = new JMenu("Tools");
		m.add(calculatorItem = new JMenuItem("Calculator"));
		m.add(calendarItem = new JMenuItem("Calendar"));
		return m;
	}
	
	private JMenu createHelpMenu() {
		JMenu m = new JMenu("Help");
		m.add(aboutItem = new JMenuItem("About"));
		return m;
	}
}
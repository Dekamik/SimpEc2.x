package simpec.gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class SimpEcToolBar extends JToolBar {
	
	public JButton newButton, loadButton, calculatorButton, calendarButton;
	
	public SimpEcToolBar() {
		super();
		createAllButtons();
	}
	
	private void createAllButtons() {
		add(newButton = new JButton("New"));
		add(loadButton = new JButton("Load"));
		add(calculatorButton = new JButton("Calculator"));
		add(calendarButton = new JButton("Calendar"));
	}
}

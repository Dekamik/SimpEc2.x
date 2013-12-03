package simpec;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SimpEcButtonPanel extends JPanel{
	
	public JButton newButton, loadButton, calculatorButton, calendarButton;
	
	public SimpEcButtonPanel() {
		super();
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		createAllButtons();
	}
	
	private void createAllButtons() {
		add(newButton = new JButton("New"));
		add(loadButton = new JButton("Load"));
		add(calculatorButton = new JButton("Calculator"));
		add(calendarButton = new JButton("Calendar"));
	}
}

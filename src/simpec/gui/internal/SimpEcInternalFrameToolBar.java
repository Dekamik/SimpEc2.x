package simpec.gui.internal;

import javax.swing.JButton;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class SimpEcInternalFrameToolBar extends JToolBar {
	
	public JButton save, saveAs, load, calculate; 

	public SimpEcInternalFrameToolBar() {
		super();
		createButtons();
	}
	
	private void createButtons() {
		add(save = new JButton("Save"));
		add(saveAs = new JButton("Save as..."));
		add(load = new JButton("Load"));
		add(calculate = new JButton("Calculate"));
	}
}

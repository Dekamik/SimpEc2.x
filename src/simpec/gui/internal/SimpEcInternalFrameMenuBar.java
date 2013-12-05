package simpec.gui.internal;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class SimpEcInternalFrameMenuBar extends JMenuBar {
	
	public JMenuItem save, saveAs, load, close;
	public JMenuItem calculate;
	public JMenuItem about;

	public SimpEcInternalFrameMenuBar() {
		add(createFileMenu());
		add(createOperationsMenu());
		add(createHelpMenu());
	}
	
	private JMenu createFileMenu() {
		JMenu m = new JMenu("File");
		m.add(save = new JMenuItem("Save"));
		m.add(saveAs = new JMenuItem("Save as..."));
		m.add(load = new JMenuItem("Load"));
		m.add(close = new JMenuItem("Close window"));
		return m;
	}
	
	private JMenu createOperationsMenu() {
		JMenu m = new JMenu("Operations");
		m.add(calculate = new JMenuItem("Calculate"));
		return m;
	}
	
	private JMenu createHelpMenu() {
		JMenu m = new JMenu("Help");
		m.add(about = new JMenuItem("About"));
		return m;
	}
}

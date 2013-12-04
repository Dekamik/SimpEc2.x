package simpecgui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JInternalFrame;

@SuppressWarnings("serial")
public class SimpEcTableFrame extends JInternalFrame {
	
	SimpEcTable gui;
	
	public SimpEcTableFrame(String name) {
		super(name);
		setLayout(new BorderLayout());
		
		add(gui = new SimpEcTable());
		
		setIconifiable(true);
		setClosable(true);
		setResizable(true);
		setBounds(100, 100, 500, 500);
		setMinimumSize(new Dimension(500, 500));
		setVisible(true);
	}
}

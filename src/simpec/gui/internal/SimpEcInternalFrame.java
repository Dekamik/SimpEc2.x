package simpec.gui.internal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JInternalFrame;


/**
 * SimpEcTableFrame is the JInternalFrame inside the workspace.
 * This class contains a SimpEcTable object which is the gui.
 * 
 * @author Dennis von Bargen
 */
@SuppressWarnings("serial")
public class SimpEcInternalFrame extends JInternalFrame {
	
	public static final int BASIC_TABLE = 1;
	
	SimpEcFrameComponent gui;
	
	public SimpEcInternalFrame(String name, int content) {
		super(name);
		setLayout(new BorderLayout());
		 
		add(gui = selectComponent(content));
		
		setIconifiable(true);
		setClosable(true);
		setResizable(true);
		setBounds(100, 100, 500, 500);
		setMinimumSize(new Dimension(400, 200));
		setVisible(true);
	}
	
	private SimpEcFrameComponent selectComponent(int content) {
		switch(content) {
		case 1: return new BasicTableComponent();
		}
		return null;
	}
}

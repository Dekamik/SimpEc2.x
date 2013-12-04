package simpec.gui.internal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;


/**
 * SimpEcTableFrame is the JInternalFrame inside the workspace.
 * This class contains a SimpEcTable object which is the gui.
 * 
 * @author Dennis von Bargen
 */
@SuppressWarnings("serial")
public class SimpEcInternalFrame extends JInternalFrame {
	
	public static final int BASIC_TABLE = 1;
	
	JPanel content;
	
	/**
	 * Creates an internal frame with the name and content specified.
	 * 
	 * @param name		A String specifying the name of the frame
	 * @param content	An int specifying what content the frame will contain
	 */
	public SimpEcInternalFrame(String name, int contentType) {
		super(name);
		setLayout(new BorderLayout());
		 
		add(this.content = selectComponent(contentType));
		
		setIconifiable(true);
		setClosable(true);
		setResizable(true);
		setBounds(100, 100, 500, 500);
		setMinimumSize(new Dimension(400, 200));
		setVisible(true);
	}
	
	private JPanel selectComponent(int contentType) {
		switch(contentType) {
		case 1: return new BasicTableComponent();
		}
		return null;
	}
}

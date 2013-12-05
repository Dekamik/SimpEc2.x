package simpec.gui.internal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import simpec.data.InputOutputHandler;


/**
 * SimpEcTableFrame is the JInternalFrame inside the workspace.
 * This class contains a SimpEcTable object which is the gui.
 * 
 * Note that the content must extend JPanel
 * 
 * @author Dennis von Bargen
 */
@SuppressWarnings("serial")
public class SimpEcInternalFrame extends JInternalFrame {
	
	public static final int BASIC_TABLE = 1;
	
	JPanel content;
	InputOutputHandler io;
	SimpEcInternalFrameToolBar toolBar;
	SimpEcInternalFrameMenuBar menuBar;
	
	private int contentType;
	
	/**
	 * Creates an internal frame with the name and content specified.
	 * 
	 * @param name		A String specifying the name of the frame
	 * @param content	An int specifying what content the frame will contain
	 */
	public SimpEcInternalFrame(String name, int contentType) {
		super(name);
		initSimpEcInternalFrame(contentType);
	}
	
	public SimpEcInternalFrame(String name, int contentType, String path) {
		super(name);
		initSimpEcInternalFrame(contentType);
		//Load a file
	}
	
	private void initSimpEcInternalFrame(int contentType) {
		setLayout(new BorderLayout());
		io = new InputOutputHandler();
		this.contentType = contentType;
		
		add(toolBar = new SimpEcInternalFrameToolBar(), BorderLayout.NORTH);
		add(this.content = selectComponent(contentType));
		
		setJMenuBar(menuBar = new SimpEcInternalFrameMenuBar());
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

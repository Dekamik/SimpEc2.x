package simpecgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SimpEcWindow extends JFrame {
	
	private SimpEcMenuBar menuBar;
	private SimpEcButtonPanel buttonPanel;
	private JDesktopPane workspace;
	
	public SimpEcWindow() {
		super("SimpEc 2.0");
		setLayout(new BorderLayout());
		
		declareComponents();
		styleComponents();
		setJMenuBar(menuBar);
		add(buttonPanel, BorderLayout.NORTH);
		add(workspace, BorderLayout.CENTER);
		
		setMinimumSize(new Dimension(300, 300));
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void declareComponents() {
		menuBar = new SimpEcMenuBar();
		buttonPanel = new SimpEcButtonPanel();
		workspace = new JDesktopPane();
	}
	
	private void styleComponents() {
		workspace.setBackground(Color.GRAY);
	}
}

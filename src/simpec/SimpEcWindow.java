package simpec;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;

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

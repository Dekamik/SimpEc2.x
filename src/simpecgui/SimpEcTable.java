package simpecgui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SimpEcTable extends JPanel {
	
	JTabbedPane p;
	JPanel income, expenditures, results;
	
	public SimpEcTable() {
		setLayout(new BorderLayout());
		
		p = new JTabbedPane();
		
		p.addTab("Income", income = createIncome());
		p.addTab("expenditures", expenditures = createExpenditures());
		add(results = createResults(), BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
	}
	
	private JPanel createIncome() {
		JPanel p = new JPanel();
		p.add(new JTextArea(12, 5));
		return p;
	}
	
	private JPanel createExpenditures() {
		JPanel p = new JPanel();
		p.add(new JTable(12, 5));
		return p;
	}
	
	private JPanel createResults() {
		JPanel p = new JPanel();
		p.add(new JTextArea(10, 2));
		return p;
	}
}

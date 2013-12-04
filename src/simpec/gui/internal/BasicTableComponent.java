package simpec.gui.internal;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import simpec.data.BasicTableData;

/**
 * SimpEcTable is the pane with the gui components inside the SimpEcTableFrame
 * 
 * @author Dennis von Bargen
 */
@SuppressWarnings("serial")
public class BasicTableComponent extends SimpEcFrameComponent {
	
	JTabbedPane p;
	JPanel income, expenditures, results;
	
	/**
	 * Creates a blank table
	 */
	public BasicTableComponent() {
		initGui();
	}
	
	/**
	 * Opens a stored basic table
	 * 
	 * @param tbl	TableData
	 */
	public BasicTableComponent(BasicTableData tbl) {
		initGui();
		//add TableData rows to the corresponding rows
	}
	
	private void initGui() {
		setLayout(new BorderLayout());
		
		p = new JTabbedPane();
		
		income = createIncome();
		expenditures = createExpenditures();
		results = createResults();
		
		p.addTab("Income", income);
		p.addTab("expenditures", expenditures);
		add(results, BorderLayout.WEST);
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

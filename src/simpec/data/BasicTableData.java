package simpec.data;

import java.util.ArrayList;

/**
 * This is a data structure for a basic month calculation.
 * It contains an arraylist each for income, expenditures and results.
 * The arraylist takes Doubles.
 * 
 * @author Dennis von Bargen
 *
 */
public class BasicTableData {
	
	public static final String FILE_EXTENSION = ".tbl";
	
	private ArrayList<Double> income;
	private ArrayList<Double> expenditures;
	private ArrayList<Double> results;
	
	public BasicTableData() {
		income = new ArrayList<Double>();
		expenditures = new ArrayList<Double>();
		results = new ArrayList<Double>();
	}
	
	public double getIncomeRow(int index) {
		return income.get(index);
	}
	
	public double getExpendRow(int index) {
		return expenditures.get(index);
	}
	
	public double getResultRow(int index) {
		return results.get(index);
	}
	
	public void setIncomeRow(int index, double value) {
		income.add(index, value);
	}
	
	public void setExpendRow(int index, double value) {
		expenditures.add(index, value);
	}
	
	public void setResultRow(int index, double value) {
		results.add(index, value);
	}
}

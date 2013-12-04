package simpecdata;

import java.util.ArrayList;

public class TableData {
	
	public static final String APPENDIX = ".tbl";
	
	private ArrayList<Double> income;
	private ArrayList<Double> expenditures;
	private ArrayList<Double> results;
	
	public TableData() {
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

package co.gc.space.graph;

import java.util.ArrayList;

public class JupiterGraph extends Graph {

	private long moneyFormula(double d, long i) {
		return (long) ((double) d - ((double) i - Math.pow(i, 10)));
	}

	private ArrayList<Object> money(double d, int numPoints) {
		ArrayList<Object> returnMoney = new ArrayList<>();
		for (long i = 0; i < numPoints; ++i) {
			returnMoney.add(moneyFormula(d, i));

		}
		return returnMoney;
	}

	private ArrayList<Object> years(int year, int times) {
		ArrayList<Object> yearReturn = new ArrayList<>();
		for (int i = 0; i < times; ++i) {
			yearReturn.add(year + (i * 10));
		}
		return yearReturn;
	}

	public JupiterGraph() {
		titleName = "Price Projection of Hydrogen Sold From Jupiter";
		xName = "Year"; 
		yName = "Price $";
		xPoints = years(2020, 7);
		yPoints = money(0.70, xPoints.size());
	}
}

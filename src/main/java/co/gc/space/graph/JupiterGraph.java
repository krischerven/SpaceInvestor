package co.gc.space.graph;

import java.util.ArrayList;

public class JupiterGraph extends Graph {

	private long moneyFormula(double startingPoint, long i) {
		return (long) ((double) startingPoint * ((double) (1.0 + Math.pow((i + 1.0), 1.0))));
	}

	private ArrayList<Object> money(double startingPoint, int numPoints) {
		ArrayList<Object> returnMoney = new ArrayList<>();
		for (long i = 0; i < numPoints; ++i) {
			returnMoney.add(moneyFormula(startingPoint, i));

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
		yName = "Price ($)";
		xPoints = years(2020, 7);
		yPoints = money(0.70, xPoints.size());
	}
}

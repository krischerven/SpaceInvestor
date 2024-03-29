package co.gc.space.graph;

import java.util.ArrayList;

public class NeptuneGraph extends Graph {

	private long moneyFormula(long startingPoint, long i) {
		return (long) ((double) startingPoint - ((double) i - Math.pow(i, 10)));
	}

	private ArrayList<Object> money(long startingPoint, int numPoints) {
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

	public NeptuneGraph() {
		titleName = "Price of Ammonia Sold From Neptune";
		xName = "Year";
		yName = "Price ($ per ton)";
		xPoints = years(2020, 7);
		yPoints = money(401, xPoints.size());
	}
}

package co.gc.space.graph;

import java.util.ArrayList;

public class Graph {

	protected ArrayList<Object> xPoints = new ArrayList<>();
	protected ArrayList<Object> yPoints = new ArrayList<>();
	protected String titleName;
	protected String xName = "";
	protected String yName = "";

	public Graph() {
		super();
	}

	public String getXPoints() {
		String ret = "";
		for (int i = 0; i < xPoints.size(); ++i) {
			ret += xPoints.get(i);
			if (i != xPoints.size() - 1) {
				ret += ",";
			}
		}
		return ret;
	}

	public String getYPoints() {
		String ret = "";
		for (int i = 0; i < yPoints.size(); ++i) {
			ret += yPoints.get(i);
			if (i != yPoints.size() - 1) {
				ret += ",";
			}
		}
		return ret;
	}

	public String getXName() {
		return xName;
	}

	public String getYName() {
		return yName;
	}

	public String getTitleName() {
		return titleName;
	}
	

}

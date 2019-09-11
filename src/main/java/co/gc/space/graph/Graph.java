package co.gc.space.graph;

import java.util.ArrayList;

public class Graph {

	protected ArrayList<Object> xPoints = new ArrayList<>();
	protected ArrayList<Object> yPoints = new ArrayList<>();
	protected String xName;
	protected String yName;
	


	public Graph() {
		super();
		
	}

	public String getXPoints() {
		String ret = "";
		for (int i = 0; i < xPoints.size(); ++i) {
			ret += xPoints.get(i);
			if (i != xPoints.size()-1) {
				ret += ",";
			}
		}
		return ret;
	}

//	public void setxPoints(ArrayList<Object> xPoints) {
//		this.xPoints = xPoints;
//	}

	public String getYPoints() {
		String ret = "";
		for (int i = 0; i < yPoints.size(); ++i) {
			ret += yPoints.get(i);
			if (i != yPoints.size()-1) {
				ret += ",";
			}
		}
		return ret;
	}

	public String getxName() {
		return xName;
	}

//	public void setxName(String xName) {
//		this.xName = xName;
//	}

	public String getyName() {
		return yName;
	}

//	public void setyName(String yName) {
//		this.yName = yName;
//	}

//	public void setyPoints(ArrayList<Object> yPoints) {
//		this.yPoints = yPoints;
//	}

	
}

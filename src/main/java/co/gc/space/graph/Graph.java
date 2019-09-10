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

	public ArrayList<Object> getxPoints() {
		return xPoints;
	}

//	public void setxPoints(ArrayList<Object> xPoints) {
//		this.xPoints = xPoints;
//	}

	public ArrayList<Object> getyPoints() {
		return yPoints;
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

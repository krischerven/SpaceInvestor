package co.gc.space.land;

import co.gc.space.entity.planet.Planet;

public class House {

	protected String price;
	protected String arces;
	protected String propertyDetails;
	protected String houseFeatures;
	protected String architecturalStyle;
	protected String condition;
	protected String yearBuilt;
	private String houseImage;
	private Planet planet;

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHouseImage() {
		return houseImage;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setArces(String arces) {
		this.arces = arces;
	}

	public void setPropertyDetails(String propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public void setHouseFeatures(String houseFeatures) {
		this.houseFeatures = houseFeatures;
	}

	public void setArchitecturalStyle(String architecturalStyle) {
		this.architecturalStyle = architecturalStyle;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public void setHouseImage(String houseImage) {
		this.houseImage = houseImage;
	}

	public String getPrice() {
		return price;
	}

	public String getArces() {
		return arces;
	}

	public String getArchitecturalStyle() {
		return architecturalStyle;
	}

	public String getCondition() {
		return condition;
	}

	public String getPropertyDetails() {
		return propertyDetails;
	}

	public String getHouseFeatures() {
		return houseFeatures;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public Planet getPlanet() {
		return planet;
	}

	public House setPlanet(Planet planet) {
		this.planet = planet;
		return this;
	}

}

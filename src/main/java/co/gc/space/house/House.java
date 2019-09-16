package co.gc.space.house;

public class House {

	protected String price;
	protected String arces;
	protected String propertyDetails;
	protected String houseFeatures;
	protected String architecturalStyle;
	protected String condition;
	protected String yearBuilt;
	private String houseImage;

	public String getHouseImage() {
		return houseImage;
	}

	public void setHouseImage(String houseImage) {
		this.houseImage = houseImage;
	}

	public House() {
		super();
		// TODO Auto-generated constructor stub
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

}

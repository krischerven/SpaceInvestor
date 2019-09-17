package co.gc.space.land;

import co.gc.space.HouseEnum;

public class UmaBHouse3 extends House {

	public UmaBHouse3() {
		price = "$342,000";
		arces = "76";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 1800sqft(inside a dome off the ground)";
		architecturalStyle = "Ranch";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/ranchhouse4.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum._47_UMA_B3;
	}

}

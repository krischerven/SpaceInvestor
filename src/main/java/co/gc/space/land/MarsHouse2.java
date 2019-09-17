package co.gc.space.land;

import co.gc.space.HouseEnum;

public class MarsHouse2 extends House {

	public MarsHouse2() {
		price = "$450,000";
		arces = "67";
		propertyDetails = "Cold, lots of canyons, or volcanoes, or dry lake beds.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 2650sqft(inside a dome off the ground)";
		architecturalStyle = "Victorian";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/victorianhouse.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MARS2;
	}

}

package co.gc.space.land;

import co.gc.space.HouseEnum;

public class SaturnHouse2 extends House {

	public SaturnHouse2() {
		price = "$2,389,000";
		arces = "268";
		propertyDetails = "No solid surface.";
		houseFeatures = "7 bedrooms, 5 bathrooms, 9900sqft(inside a dome off the ground)";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse3.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.SATURN2;
	}

}

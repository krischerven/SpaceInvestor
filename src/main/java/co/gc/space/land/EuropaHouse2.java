package co.gc.space.land;

import co.gc.space.HouseEnum;

public class EuropaHouse2 extends House {

	public EuropaHouse2() {
		price = "$1,890,000";
		arces = "250";
		propertyDetails = "Ice layer on top and ocean beneath(maybe)";
		houseFeatures = "6 bedrooms, 5 bathrooms, 7500sqft(inside a dome off the ground)";
		architecturalStyle = "Tudor";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/tudorhouse2.jpg");
	}

	public HouseEnum toEnum() {
		return HouseEnum.EUROPA2;
	}

}

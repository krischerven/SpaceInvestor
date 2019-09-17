package co.gc.space.land;

import co.gc.space.HouseEnum;

public class K2_18BHouse2 extends House {

	public K2_18BHouse2() {
		price = "$412,000";
		arces = "70";
		propertyDetails = "No solid ground. Lots of gases everywhere.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3000sqft(inside a dome off the ground)";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanishhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.K2_18_B2;
	}

}

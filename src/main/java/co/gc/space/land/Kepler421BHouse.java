package co.gc.space.land;

import co.gc.space.HouseEnum;

public class Kepler421BHouse extends House {

	public Kepler421BHouse() {
		price = "$730,000";
		arces = "85";
		propertyDetails = "Found by the snowline, Cold, snowy mountains.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 2000sqft";
		architecturalStyle = "Ranch";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/ranchhouse.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.KEPLER_421_B;
	}

}

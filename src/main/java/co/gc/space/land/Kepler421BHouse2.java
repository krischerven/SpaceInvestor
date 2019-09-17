package co.gc.space.land;

import co.gc.space.HouseEnum;

public class Kepler421BHouse2 extends House {

	public Kepler421BHouse2() {
		price = "$400,000";
		arces = "50";
		propertyDetails = "Found by the snowline, Cold, snowy mountains.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1200sqft(inside a dome off the ground)";
		architecturalStyle = "Craftsman";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/craftsmanhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.KEPLER_421_B2;
	}

}

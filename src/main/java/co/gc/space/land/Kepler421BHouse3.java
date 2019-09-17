package co.gc.space.land;

import co.gc.space.HouseEnum;

public class Kepler421BHouse3 extends House {

	public Kepler421BHouse3() {
		
		price = "$642,000";
		arces = "97";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 2560sqft(inside a dome off the ground)";
		architecturalStyle = "Victorian";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/victorianhouse4.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.KEPLER_421_B3;
	}

}

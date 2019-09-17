package co.gc.space.land;

import co.gc.space.HouseEnum;

public class UmaBHouse2 extends House {

	public UmaBHouse2() {
		price = "$613,000";
		arces = "145";
		propertyDetails = "Earth like, nice scenary.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 3900sqft(inside a dome off the ground)";
		architecturalStyle = "Victorian";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/victorianhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum._47_UMA_B2;
	}

}

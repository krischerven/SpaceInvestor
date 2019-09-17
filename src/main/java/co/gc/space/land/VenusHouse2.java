package co.gc.space.land;

import co.gc.space.HouseEnum;

public class VenusHouse2 extends House {

	public VenusHouse2() {
		price = "$560,000";
		arces = "132";
		propertyDetails = "Dark and hot, has old lava flows. Lowlands and highlands of your choosing.";
		houseFeatures = "5 bedrooms, 4 bathrooms, 4500sqft(inside a dome off the ground)";
		architecturalStyle = "Pueblo Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/pueblorevivalhouse3.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.VENUS2;
	}

}

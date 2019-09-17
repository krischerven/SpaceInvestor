package co.gc.space.land;

import co.gc.space.HouseEnum;

public class JupiterHouse2 extends House {

	public JupiterHouse2() {
		price = "$1,234,000";
		arces = "250";
		propertyDetails = "Ice layer on top and ocean beneath(maybe)";
		houseFeatures = "6 bedrooms, 5 bathrooms, 7500sqft(inside a dome off the ground)";
		architecturalStyle = "Pueblo Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/pueblorevivalhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.JUPITER2;
	}

}

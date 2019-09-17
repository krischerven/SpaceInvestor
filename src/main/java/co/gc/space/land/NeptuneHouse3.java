package co.gc.space.land;

import co.gc.space.HouseEnum;

public class NeptuneHouse3 extends House {

	public NeptuneHouse3() {
		price = "$428,000";
		arces = "99";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 2130sqft(inside a dome off the ground)";
		architecturalStyle = "The Cape Cod";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/thecapecodhouse4.jpeg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.NEPTUNE3;
	}

}

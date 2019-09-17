package co.gc.space.land;

import co.gc.space.HouseEnum;

public class MercuryHouse2 extends House {

	public MercuryHouse2() {
		price = "$750,000";
		arces = "125";
		propertyDetails = "Open with carter fields or without carter fields.";
		houseFeatures = "6 bedrooms, 6 bathrooms, 9000sqft(inside a dome off the ground)";
		architecturalStyle = "The Cape Cod";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/thecapecodhouse.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MERCURY2;
	}

}

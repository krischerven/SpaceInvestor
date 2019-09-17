package co.gc.space.land;

import co.gc.space.HouseEnum;

public class UranusHouse2 extends House {

	public UranusHouse2() {
		price = "$456,000";
		arces = "69";
		propertyDetails = "Icy and gases covered atmosphere.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 6900sqft(inside a dome off the ground)";
		architecturalStyle = "The Cape Cod";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/thecapecodhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.URANUS2;
	}

}

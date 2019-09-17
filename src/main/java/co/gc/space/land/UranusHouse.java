package co.gc.space.land;

import co.gc.space.HouseEnum;

public class UranusHouse extends House {

	public UranusHouse() {
		price = "$237,000";
		arces = "40";
		propertyDetails = "Icy and gases covered atmosphere.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 2000sqft(inside a dome off the ground)";
		architecturalStyle = "Craftsman";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/craftsmanhouse.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.URANUS;
	}

}

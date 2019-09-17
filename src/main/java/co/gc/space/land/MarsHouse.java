package co.gc.space.land;

import co.gc.space.HouseEnum;

public class MarsHouse extends House {

	public MarsHouse() {
		price = "$923,000";
		arces = "150";
		propertyDetails = "Cold, lots of canyons, or volcanoes, or dry lake beds.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 4400sqft(inside a dome)";
		architecturalStyle = ("English Cottage");
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/englishcottagehouse.jpeg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MARS;
	}


}

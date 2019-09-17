package co.gc.space.land;

import co.gc.space.HouseEnum;

public class K2_3CHouse extends House {

	public K2_3CHouse() {
		price = "$532,230";
		arces = "88";
		propertyDetails = "Gases all around.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 3430sqft(inside a dome off the ground)";
		architecturalStyle = "Greek Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/greekrevivalhouse3.jpeg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.K2_3_C;
	}

}

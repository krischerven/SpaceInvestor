package co.gc.space.land;

import co.gc.space.HouseEnum;

public class Trappist_1HHouse3 extends House {

	public Trappist_1HHouse3() {
		price = "$378,323";
		arces = "34";
		propertyDetails = "Might be like Earth and Mars.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1923sqft(inside a dome off the ground)";
		architecturalStyle = "Craftsman";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/craftsmanhouse3.jpg");
	}
	public HouseEnum toEnum() {
		return HouseEnum.TRAPPIST_1_H3;
	}
}

package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class K2_18BHouse2 extends House {

	public K2_18BHouse2() {
		price = "$465,000";
		arces = "74";
		propertyDetails = "A super Earth. Just like home.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 2650sqft(inside a dome off the ground)";
		architecturalStyle = "Ranch";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/ranchhouse5.jpg");
		setPlanet(PlanetBuilder.Build("K2-18 b"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.K2_18_B2;
	}

}

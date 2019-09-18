package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class K2_18BHouse3 extends House {

	public K2_18BHouse3() {
		price = "$876,050";
		arces = "213";
		propertyDetails = "No solid ground. Lots of gases everywhere.";
		houseFeatures = "7 bedrooms, 5 bathrooms, 9234sqft(inside a dome off the ground)";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse6.jpg");
		setPlanet(PlanetBuilder.Build("K2-18 b"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.K2_18_B3;
	}

}

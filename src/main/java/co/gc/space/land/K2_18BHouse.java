package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.Jupiter;

public class K2_18BHouse extends House {

	public K2_18BHouse() {
		price = "322,000";
		arces = "64";
		propertyDetails = "A super Earth. Just like home.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 2111sqft(inside a dome off the ground)";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanishhouse4.jpeg");
		setPlanet(PlanetBuilder.Build("K2-18 b"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.K2_18_B;
	}

}

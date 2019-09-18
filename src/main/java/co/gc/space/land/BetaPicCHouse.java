package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicCHouse extends House {

	public BetaPicCHouse() {
		price = "$234,000";
		arces = "55";
		propertyDetails = "No solid ground";
		houseFeatures = "4 bedrooms, 2 bathrooms, 2700sqft(inside a dome off the ground";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanisharchitecturehouse.jpg");
		setPlanet(PlanetBuilder.Build("beta pic c"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.BETAPICC;
	}

}

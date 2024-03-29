package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicCHouse3 extends House {

	public BetaPicCHouse3() {
		price = "$242,000";
		arces = "74";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 1800sqft(inside a dome off the ground)";
		architecturalStyle = "The Cape Cod";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/thecapecodhouse3.jpg");
		setPlanet(PlanetBuilder.Build("beta pic c"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.BETAPICC3;
	}

}

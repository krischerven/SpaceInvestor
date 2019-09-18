package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicCHouse2 extends House {

	public BetaPicCHouse2() {
		price = "$190,000";
		arces = "70";
		propertyDetails = "No solid ground";
		houseFeatures = "2 bedrooms, 2 bathrooms, 1500sqft(inside a dome off the ground)";
		architecturalStyle = "English Cottage";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/englishcottagehouse2.jpg");
		setPlanet(PlanetBuilder.Build("beta pic c"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.BETAPICC2;
	}

}

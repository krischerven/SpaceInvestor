package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicBHouse3 extends House {

	public BetaPicBHouse3() {
		price = "$189,000";
		arces = "56";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1560sqft(inside a dome off the ground)";
		architecturalStyle = "Victorian";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/victorianhouse3.jpg");
		setPlanet(PlanetBuilder.Build("beta pic b"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.BETAPICB3;
	}

}

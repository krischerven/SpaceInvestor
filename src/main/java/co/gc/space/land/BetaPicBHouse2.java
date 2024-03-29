package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicBHouse2 extends House {
	
	public BetaPicBHouse2() {
		price = "$500,000";
		arces = "85";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "5 bedrooms, 3 bathrooms, 3400sqft(inside a dome off the ground)";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse2.jpg");
		setPlanet(PlanetBuilder.Build("beta pic b"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.BETAPICB2;
	}

}

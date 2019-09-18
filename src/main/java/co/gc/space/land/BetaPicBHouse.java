package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class BetaPicBHouse extends House {

	public BetaPicBHouse() {
		price = "$342,000";
		arces = "76";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 1800sqft(inside a dome off the ground)";
		architecturalStyle = "Greek Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/greekrevivalhouse.jpg");
		setPlanet(PlanetBuilder.Build("beta pic b"));
	
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.BETAPICB;
	}

}

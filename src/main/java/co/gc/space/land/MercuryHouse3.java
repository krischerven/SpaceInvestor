package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Mercury;

public class MercuryHouse3 extends House {

	public MercuryHouse3() {
		price = "$342,000";
		arces = "76";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 1800sqft(inside a dome off the ground)";
		architecturalStyle = "Tudor";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/tudorhouse4.jpg");
		setPlanet(new Mercury());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MERCURY3;
	}

}

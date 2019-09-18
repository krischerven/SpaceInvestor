package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Venus;

public class VenusHouse3 extends House {

	public VenusHouse3() {
		price = "$262,000";
		arces = "58";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1132sqft(inside a dome off the ground)";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanishhouse3.jpg");
		setPlanet(new Venus());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.VENUS3;
	}

}

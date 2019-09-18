package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Saturn;

public class SaturnHouse3 extends House {

	public SaturnHouse3() {
		price = "$312,000";
		arces = "79";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 3 bathrooms, 1800sqft(inside a dome off the ground)";
		architecturalStyle = "Greek Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/greekrevivalhouse4.jpeg");
		setPlanet(new Saturn());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.SATURN3;
	}

}

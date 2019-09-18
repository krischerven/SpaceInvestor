package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Saturn;

public class SaturnHouse extends House {

	public SaturnHouse() {
		price = "$555,000";
		arces = "45";
		propertyDetails = "No solid surface.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 2400sqft(inside a dome off the ground)";
		architecturalStyle = "Tudor";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/tudorhouse.jpg");
		setPlanet(new Saturn());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.SATURN;
	}

}

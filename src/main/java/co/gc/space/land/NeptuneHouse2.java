package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Neptune;

public class NeptuneHouse2 extends House {

	public NeptuneHouse2() {
		price = "$345,000";
		arces = "77";
		propertyDetails = "High winds blowing, gases around.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1200sqft(inside a dome off the ground)";
		architecturalStyle = "Tudor";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/tudorhouse3.jpg");
		setPlanet(new Neptune());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.NEPTUNE2;
	}

}

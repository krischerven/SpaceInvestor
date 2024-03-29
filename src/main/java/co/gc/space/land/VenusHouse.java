package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Venus;

public class VenusHouse extends House {

	public VenusHouse() {

		price = "$512,000";
		arces = "60";
		propertyDetails = "Dark and hot, has old lava flows. Lowlands and highlands of your choosing.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3400sqft(inside a dome)";
		architecturalStyle = "Ranch";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/ranchhouse2.jpg");
		setPlanet(new Venus());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.VENUS;
	}

}

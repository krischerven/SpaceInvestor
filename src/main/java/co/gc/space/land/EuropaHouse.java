package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.Europa;

public class EuropaHouse extends House {

	public EuropaHouse() {
		price = "$670,000";
		arces = "150";
		propertyDetails = "Ice layer on top and ocean beneath(maybe)";
		houseFeatures = "4 bedrooms, 2 bathrooms, 2700sqft(inside a dome off the ground";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanishhouse.jpg");
		setPlanet(new Europa());
	}

	public HouseEnum toEnum() {
		return HouseEnum.EUROPA;
	}

}

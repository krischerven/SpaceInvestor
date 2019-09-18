package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Jupiter;

public class JupiterHouse extends House {

	public JupiterHouse() {
		price = "$412,000";
		arces = "70";
		propertyDetails = "No solid ground. Lots of gases everywhere.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3000sqft(inside a dome off the ground)";
		architecturalStyle = "Spanish";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/spanishhouse2.jpg");
		setPlanet(new Jupiter());
	}

	public HouseEnum toEnum() {
		return HouseEnum.JUPITER;
	}

}

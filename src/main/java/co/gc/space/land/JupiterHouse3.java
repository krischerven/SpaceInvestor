package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Jupiter;

public class JupiterHouse3 extends House {

	public JupiterHouse3() {
		price = "$378,000";
		arces = "87";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1934sqft(inside a dome off the ground)";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse4.jpg");
		setPlanet(new Jupiter());
	}

	public HouseEnum toEnum() {
		return HouseEnum.JUPITER3;
	}

}

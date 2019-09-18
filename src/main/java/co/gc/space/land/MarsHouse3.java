package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Mars;

public class MarsHouse3 extends House {

	public MarsHouse3() {
		price = "$210,000";
		arces = "43";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1230sqft(inside a dome off the ground)";
		architecturalStyle = "Ranch";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/ranchhouse3.jpeg");
		setPlanet(new Mars());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MARS3;
	}

}

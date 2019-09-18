package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Europa;

public class EuropaHouse3 extends House {

	public EuropaHouse3() {
		price = "$212,000";
		arces = "46";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "3 bedrooms, 2 bathrooms, 1230sqft(inside a dome off the ground)";
		architecturalStyle = "English Cottage";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/englishcottagehouse3.jpg");
		setPlanet(new Europa());
	}

	public HouseEnum toEnum() {
		return HouseEnum.EUROPA3;
	}

}

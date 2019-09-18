package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Mars;

public class MarsHouse extends House {

	public MarsHouse() {
		price = "$923,000";
		arces = "150";
		propertyDetails = "Cold, lots of canyons, or volcanoes, or dry lake beds.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 4400sqft(inside a dome)";
		architecturalStyle = ("English Cottage");
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/englishcottagehouse.jpeg");
		setPlanet(new Mars());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MARS;
	}


}

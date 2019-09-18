package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Uranus;

public class UranusHouse3 extends House {

	public UranusHouse3() {
		price = "$682,000";
		arces = "154";
		propertyDetails = "No solid ground. Bigger Jupiter.";
		houseFeatures = "5 bedrooms, 5 bathrooms, 4570sqft(inside a dome off the ground)";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse5.jpg");
		setPlanet(new Uranus());
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.URANUS3;
	}

}

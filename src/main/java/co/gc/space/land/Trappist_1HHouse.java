package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.Saturn;

public class Trappist_1HHouse extends House {

	public Trappist_1HHouse() {
		price = "$563,000";
		arces = "74";
		propertyDetails = "Might be like Earth and Mars.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3000sqft(inside a dome off the ground)";
		architecturalStyle = "Pueblo Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/pueblorevivalhouse4.jpeg");
		setPlanet(PlanetBuilder.Build("Trappist-1 h"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.TRAPPIST_1_H;
	}

}

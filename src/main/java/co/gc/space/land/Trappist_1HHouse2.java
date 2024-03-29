package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class Trappist_1HHouse2 extends House {

	public Trappist_1HHouse2() {
		price = "$623,230";
		arces = "97";
		propertyDetails = "Might be like Earth and Mars.";
		houseFeatures = "6 bedrooms, 4 bathrooms, 4350sqft(inside a dome off the ground)";
		architecturalStyle = "English Cottage";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/englishcottagehouse4.jpeg");
		setPlanet(PlanetBuilder.Build("Trappist-1 h"));
	}
	public HouseEnum toEnum() {
		return HouseEnum.TRAPPIST_1_H2;
	}
}

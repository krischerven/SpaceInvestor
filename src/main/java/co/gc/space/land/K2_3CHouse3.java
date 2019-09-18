package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class K2_3CHouse3 extends House {

	public K2_3CHouse3() {
		price = "$472,000";
		arces = "81";
		propertyDetails = "Gases all around.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3893sqft(inside a dome off the ground)";
		architecturalStyle = "Victorian";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/victorianhouse5.jpg");
		setPlanet(PlanetBuilder.Build("K2-3 c"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.K2_3_C3;
	}

}

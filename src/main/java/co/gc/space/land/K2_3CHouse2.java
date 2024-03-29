package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class K2_3CHouse2 extends House {

	public K2_3CHouse2() {
		price = "$301,056";
		arces = "32";
		propertyDetails = "Gases all around.";
		houseFeatures = "2 bedrooms, 2 bathrooms, 1670sqft(inside a dome off the ground)";
		architecturalStyle = "The Cape Cod";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/thecapecodhouse5.jpg");
		setPlanet(PlanetBuilder.Build("K2-3 c"));
	}

	public HouseEnum toEnum() {
		return HouseEnum.K2_3_C2;
	}

}

package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;

public class UmaBHouse extends House {

	public UmaBHouse() {
		price = "$1,545,000";
		arces = "100";
		propertyDetails = "Earth like, nice scenary.";
		houseFeatures = "6 bedrooms, 4 bathrooms, 7400sqft";
		architecturalStyle = "Modern";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/modernhouse.jpg");
		setPlanet(PlanetBuilder.Build("47 uma b"));
	}
	
	public HouseEnum toEnum() {
		return HouseEnum._47_UMA_B;
	}

}

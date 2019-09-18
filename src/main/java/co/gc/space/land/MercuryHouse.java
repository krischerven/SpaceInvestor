package co.gc.space.land;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Mercury;

public class MercuryHouse extends House {

	public MercuryHouse() {
		price = "$834,000";
		arces = "100";
		propertyDetails = "Open with carter fields or without carter fields.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 6,000sqft(inside a dome)";
		architecturalStyle = "Pueblo Revival architecture";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/pueblorevivalhouse.jpg");
		setPlanet(new Mercury());

	}
	
	public HouseEnum toEnum() {
		return HouseEnum.MERCURY;
	}

}

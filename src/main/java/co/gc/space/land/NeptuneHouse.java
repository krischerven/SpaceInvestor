package co.gc.space.land;

import co.gc.space.HouseEnum;

public class NeptuneHouse extends House {

	public NeptuneHouse() {
		price = "$498,000";
		arces = "50";
		propertyDetails = "High winds blowing, gases around.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 2400sqft(inside a dome that's inforced)";
		architecturalStyle = "Greek Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/greekrevivalhouse2.jpg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.NEPTUNE;
	}

}

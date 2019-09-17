package co.gc.space.land;

<<<<<<< HEAD:src/main/java/co/gc/space/land/Trapist_1HHouse.java
import co.gc.space.HouseEnum;

public class Trapist_1HHouse extends House {
=======
public class Trappist_1HHouse extends House {
>>>>>>> master:src/main/java/co/gc/space/land/Trappist_1HHouse.java

	public Trappist_1HHouse() {
		price = "$563,000";
		arces = "74";
		propertyDetails = "Might be like Earth and Mars.";
		houseFeatures = "4 bedrooms, 3 bathrooms, 3000sqft(inside a dome off the ground)";
		architecturalStyle = "Pueblo Revival";
		condition = "New";
		yearBuilt = "2040";
		setHouseImage("../images/pueblorevivalhouse4.jpeg");
	}
	
	public HouseEnum toEnum() {
		return HouseEnum.TRAPIST_1_H;
	}

}

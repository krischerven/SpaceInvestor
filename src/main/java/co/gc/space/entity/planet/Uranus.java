package co.gc.space.entity.planet;

public class Uranus extends SolarSystemPlanet {

	public Uranus() {
		super();
		setPlanetName("Uranus");
		setStarName("Sun");
		setYearDiscovered("1781");
		setMass("8.681 × 10^25 kg");
		setRadius("15,759 mi");
		setPeriod("84 Years");
		setTempCalculated("59K");
		setMinTemp("49K");
		setMaxTemp("69K");
		setStarDistance("1.8 Billion Miles");

		setImageUrl("https://space-facts.com/wp-content/uploads/uranus-transparent.png");
		setJspTag("planets/uranus");
		setGifImage("../images/uranusspin.gif");
		setHouseImage("../images/craftsmanhouse");
	}

}

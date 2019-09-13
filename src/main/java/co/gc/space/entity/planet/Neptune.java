package co.gc.space.entity.planet;

public class Neptune extends SolarSystemPlanet {

	public Neptune() {
		super();
		setPlanetName("Neptune");
		setStarName("Sun");
		setYearDiscovered("1846");
		setMass("1.024 × 10^26 kg");
		setRadius("15299 miles");
		setPeriod("165 Years");
		setTempCalculated("59K");
		setMinTemp("55K");
		setMaxTemp("72");
		setStarDistance("2.8 Billion Miles");

		setImageUrl("https://space-facts.com/wp-content/uploads/neptune-transparent.png");
		setJspTag("planets/neptune");
		setGifImage("../images/neptunespin.gif");
		setHouseImage("../images/greekrevivalhouse2.jpg");

	}

}

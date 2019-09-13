package co.gc.space.entity.planet;

public class Mars extends SolarSystemPlanet {

	public Mars() {
		super();
		setPlanetName("Mars");
		setStarName("Sun");
		setYearDiscovered("1659");
		setMass("6.39 × 10^23 kg");
		setRadius("2,106.1 mi");
		setPeriod("687 Days");
		setTempCalculated("210K");
		setMinTemp("120K");
		setMaxTemp("293K");
		setStarDistance("33.9 Million Miles");

		setImageUrl("https://space-facts.com/wp-content/uploads/mars-transparent.png");
		setJspTag("planets/mars");
		setGifImage("../images/marsspin.gif");
		setHouseImage("../images/englishcottagehouse.jpg");

	}

}

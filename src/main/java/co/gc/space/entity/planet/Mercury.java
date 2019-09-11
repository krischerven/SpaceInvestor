package co.gc.space.entity.planet;

public class Mercury extends SolarSystemPlanet {

	public Mercury() {
		super();
		setPlanetName("Mercury");
		setStarName("Sun");
		setYearDiscovered("256 BC");
		setMass("3.285 × 10^23 kg");
		setRadius("1,516 mi");
		setPeriod("88 Days");
		setTempCalculated("439K");
		setMinTemp("100K");
		setMaxTemp("700K");
		setStarDistance("48 Million Miles");

		setImageUrl("https://space-facts.com/wp-content/uploads/mercury-transparent.png");
		setJspTag("planets/mercury");
		setGifImage("../images/mercuryspin.gif");

	}

}
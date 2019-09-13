package co.gc.space.entity.planet;

// not a planet or a solar system planet, but we know more about Europa than we know about exoplanets
public class Europa extends SolarSystemPlanet {

	public Europa() {
		super();
		setPlanetName("Europa");
		setStarName("Sun");
		setYearDiscovered("1610");
		setMass("4.7998 ×10^22 kg");
		setRadius("969.84 mi");
		setPeriod("3 1/2 days");
		setTempCalculated("111 K");
		setMinTemp("50 K");
		setMaxTemp("111 K");
		setStarDistance("484 Million Miles");

		setImageUrl("https://i.dlpng.com/static/png/1131091_preview_preview.png");
		setJspTag("planets/europa");
		setGifImage("../images/europaspin.gif");
		setHouseImage("../images/spanishhouse.jpg");

	}

}

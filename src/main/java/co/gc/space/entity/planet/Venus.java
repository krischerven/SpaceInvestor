package co.gc.space.entity.planet;

public class Venus extends SolarSystemPlanet{

	public Venus() {
		super();
		setPlanetName("Venus");
		setStarName("Sun");
		setYearDiscovered("1610");
		setMass("4.867 × 10^24 kg");
		setRadius("3,760.4 mi");
		setPeriod("225 days");
		setTempCalculated("735K");
		setMinTemp("710K");
		setMaxTemp("755");
		setStarDistance("67 Million Miles");
		
		setImageUrl("https://space-facts.com/wp-content/uploads/venus-transparent.png");
		setJspTag("planets/venus");
		setGifImage("../images/venusspin.gif");
		
	}

	
	

}

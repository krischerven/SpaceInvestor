package co.gc.space.entity.planet;

public class Saturn extends SolarSystemPlanet{

	public Saturn() {
		super();
		setPlanetName("Saturn");
		setStarName("Sun");
		setYearDiscovered("1610");
		setMass("5.683 × 10^26 kg");
		setRadius("36,184 mi");
		setPeriod("29 Years");
		setTempCalculated("156K");
		setMinTemp("99K");
		setMaxTemp("160K");
		setStarDistance("886 Million Miles");
		
		setImageUrl("https://space-facts.com/wp-content/uploads/saturn-transparent.png");
		setJspTag("planets/saturn");

	}

	@Override
	public String toString() {
		return "<img src="+getImageUrl()+" + alt=hello height=" + 600 + " width=" + 600 +">";
	}
	
	
	
//	@Override
//	public String toString() {
//		return "<img src=https://images.theconversation.com/files/286855/original/file-20190805-117866-dgviij.jpg?ixlib=rb-1.1.0&rect=0%2C0%2C5000%2C2776&q=45&auto=format&w=496&fit=clip>" ;
//	}
//	
}

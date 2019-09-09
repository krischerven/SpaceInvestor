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
		
		setImageUrl("https://images.theconversation.com/files/286855/original/file-20190805-117866-dgviij.jpg?ixlib=rb-1.1.0&rect=0%2C0%2C5000%2C2776&q=45&auto=format&w=496&fit=clip");
		setJspTag("planets/saturn");

	}

	@Override
	public String toString() {
		return "<img src=https://images.theconversation.com/files/286855/original/file-20190805-117866-dgviij.jpg?ixlib=rb-1.1.0&rect=0%2C0%2C5000%2C2776&q=45&auto=format&w=496&fit=clip>" + "Saturn [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
				+ super.toString() + ", getJspTag()=" + getJspTag() + ", getImageUrl()=" + getImageUrl()
				+ ", getPlanetName()=" + getPlanetName() + ", getStarName()=" + getStarName()
				+ ", getPublicationStatus()=" + getPublicationStatus() + ", getYearDiscovered()=" + getYearDiscovered()
				+ ", getMass()=" + getMass() + ", getMassErrorMin()=" + getMassErrorMin() + ", getMassErrorMax()="
				+ getMassErrorMax() + ", getRadius()=" + getRadius() + ", getRadiusErrorMin()=" + getRadiusErrorMin()
				+ ", getRadiusErrorMax()=" + getRadiusErrorMax() + ", getPeriod()=" + getPeriod()
				+ ", getPeriodErrorMin()=" + getPeriodErrorMin() + ", getPeriodErrorMax()=" + getPeriodErrorMax()
				+ ", getTempCalculated()=" + getTempCalculated() + ", getTempMeasured()=" + getTempMeasured()
				+ ", getStarDistance()=" + getStarDistance() + ", getStarDistanceErrorMin()="
				+ getStarDistanceErrorMin() + ", getStarDistanceErrorMax()=" + getStarDistanceErrorMax()
				+ ", getInclination()=" + getInclination() + ", getInclinationErrorMin()=" + getInclinationErrorMin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
//	@Override
//	public String toString() {
//		return "<img src=https://images.theconversation.com/files/286855/original/file-20190805-117866-dgviij.jpg?ixlib=rb-1.1.0&rect=0%2C0%2C5000%2C2776&q=45&auto=format&w=496&fit=clip>" ;
//	}
//	
}

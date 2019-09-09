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
		
		setImageUrl("https://specials-images.forbesimg.com/imageserve/646438312/960x0.jpg?fit=scale");
		setJspTag("planets/venus");
		
	}

	@Override
	public String toString() {
		return "<img src=https://specials-images.forbesimg.com/imageserve/646438312/960x0.jpg?fit=scale alt=hello>" + "Venus [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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
	
	
	

}

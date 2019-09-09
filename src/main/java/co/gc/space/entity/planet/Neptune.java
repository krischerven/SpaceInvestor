package co.gc.space.entity.planet;

public class Neptune extends SolarSystemPlanet{

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
		
		setImageUrl("https://theastrocodex.com/wp-content/uploads/2017/08/Neptune-in-astrology.jpg");
		setJspTag("planets/neptune");

	}

	@Override
	public String toString() {
		return "<img src=https://www.movaglobes.com/blog/wp-content/uploads/2019/05/Uranus-by-voyager-2.png alt=hello>" + "Neptune [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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

package co.gc.space.entity.planet;

public class Uranus extends SolarSystemPlanet{

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
		
		setImageUrl("https://www.movaglobes.com/blog/wp-content/uploads/2019/05/Uranus-by-voyager-2.png");
		setJspTag("planets/uranus");
	}

	@Override
	public String toString() {
		return "<img src=https://www.movaglobes.com/blog/wp-content/uploads/2019/05/Uranus-by-voyager-2.png alt=hello>" + "Uranus [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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

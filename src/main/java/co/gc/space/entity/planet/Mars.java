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
		
		setImageUrl("https://www.classicalwcrb.org/sites/wcrb/files/styles/medium/public/201609/mars-614x412.jpg");
		setJspTag("planets/mars");
		
	}

	@Override
	public String toString() {
		return "<img src=https://www.classicalwcrb.org/sites/wcrb/files/styles/medium/public/201609/mars-614x412.jpg alt=hello>" + "Mars [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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

package co.gc.space.entity.planet;

public class Jupiter extends SolarSystemPlanet{

	public Jupiter() {
		super();
		setPlanetName("Jupiter");
		setStarName("Sun");
		setYearDiscovered("1610");
		setMass("1.898 × 10^27 kg");
		setRadius("43,441 mi");
		setPeriod("12 Years");
		setTempCalculated("83K");
		setMinTemp("49K");
		setMaxTemp("313K");
		setStarDistance("484 Million Miles");
		
		setImageUrl("https://cosmos-magazine.imgix.net/file/spina/photo/10734/170613_Jupiter_Full.jpg?fit=clip&w=835");
		setJspTag("planets/jupiter");
		
	}

	@Override
	public String toString() {
		return "<img src=https://cosmos-magazine.imgix.net/file/spina/photo/10734/170613_Jupiter_Full.jpg?fit=clip&w=835 alt=hello>" + "Jupiter [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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

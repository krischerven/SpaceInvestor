package co.gc.space.entity.planet;

public class Mercury extends SolarSystemPlanet{

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
		
		setImageUrl("https://cbsnews1.cbsistatic.com/hub/i/2015/06/15/6e1bf532-0b6e-4c2a-a0ec-afa4283782a2/messengersiridescentmercury-1.jpg");
		setJspTag("planets/mercury");

}

	@Override
	public String toString() {
		return "<img src=https://cbsnews1.cbsistatic.com/hub/i/2015/06/15/6e1bf532-0b6e-4c2a-a0ec-afa4283782a2/messengersiridescentmercury-1.jpg alt=hello>" + "Mercury [getMinTemp()=" + getMinTemp() + ", getMaxTemp()=" + getMaxTemp() + ", toString()="
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
//		return "<img src=https://cbsnews1.cbsistatic.com/hub/i/2015/06/15/6e1bf532-0b6e-4c2a-a0ec-afa4283782a2/messengersiridescentmercury-1.jpg alt=hello>" ;
//	}
	
}
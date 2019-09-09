package co.gc.space.entity.planet;

public class SolarSystemPlanet extends Planet {
	
	private String minTemp;
	private String maxTemp;
	

	public SolarSystemPlanet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	@Override
	public String toString() {
		return "SolarSystemPlanet [minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", getMinTemp()=" + getMinTemp()
				+ ", getMaxTemp()=" + getMaxTemp() + ", getPlanetName()=" + getPlanetName() + ", getStarName()="
				+ getStarName() + ", getPublicationStatus()=" + getPublicationStatus() + ", getYearDiscovered()="
				+ getYearDiscovered() + ", getMass()=" + getMass() + ", getMassErrorMin()=" + getMassErrorMin()
				+ ", getMassErrorMax()=" + getMassErrorMax() + ", getRadius()=" + getRadius() + ", getRadiusErrorMin()="
				+ getRadiusErrorMin() + ", getRadiusErrorMax()=" + getRadiusErrorMax() + ", getPeriod()=" + getPeriod()
				+ ", getPeriodErrorMin()=" + getPeriodErrorMin() + ", getPeriodErrorMax()=" + getPeriodErrorMax()
				+ ", getTempCalculated()=" + getTempCalculated() + ", getTempMeasured()=" + getTempMeasured()
				+ ", getStarDistance()=" + getStarDistance() + ", getStarDistanceErrorMin()="
				+ getStarDistanceErrorMin() + ", getStarDistanceErrorMax()=" + getStarDistanceErrorMax()
				+ ", getInclination()=" + getInclination() + ", getInclinationErrorMin()=" + getInclinationErrorMin()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}



	
	

}

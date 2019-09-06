package co.gc.space.entity.planet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

	private String planetName;
	private String starName;
	private String publicationStatus;
	private String yearDiscovered;
	private String mass;
	private String massErrorMin;
	private String massErrorMax;
	private String radius;
	private String radiusErrorMin;
	private String radiusErrorMax;
	private String period;
	private String periodErrorMin;
	private String periodErrorMax;
	private String tempCalculated;
	private String tempMeasured;
	private String starDistance;
	private String starDistanceErrorMin;
	private String starDistanceErrorMax;
	private String inclination;
	private String inclinationErrorMin;

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	
}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public String getStarName() {
		return starName;
	}

	public void setStarName(String starName) {
		this.starName = starName;
	}

	public String getPublicationStatus() {
		return publicationStatus;
	}

	public void setPublicationStatus(String publicationStatus) {
		this.publicationStatus = publicationStatus;
	}

	public String getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(String yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getMassErrorMin() {
		return massErrorMin;
	}

	public void setMassErrorMin(String massErrorMin) {
		this.massErrorMin = massErrorMin;
	}

	public String getMassErrorMax() {
		return massErrorMax;
	}

	public void setMassErrorMax(String massErrorMax) {
		this.massErrorMax = massErrorMax;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getRadiusErrorMin() {
		return radiusErrorMin;
	}

	public void setRadiusErrorMin(String radiusErrorMin) {
		this.radiusErrorMin = radiusErrorMin;
	}

	public String getRadiusErrorMax() {
		return radiusErrorMax;
	}

	public void setRadiusErrorMax(String radiusErrorMax) {
		this.radiusErrorMax = radiusErrorMax;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPeriodErrorMin() {
		return periodErrorMin;
	}

	public void setPeriodErrorMin(String periodErrorMin) {
		this.periodErrorMin = periodErrorMin;
	}

	public String getPeriodErrorMax() {
		return periodErrorMax;
	}

	public void setPeriodErrorMax(String periodErrorMax) {
		this.periodErrorMax = periodErrorMax;
	}

	public String getTempCalculated() {
		return tempCalculated;
	}

	public void setTempCalculated(String tempCalculated) {
		this.tempCalculated = tempCalculated;
	}

	public String getTempMeasured() {
		return tempMeasured;
	}

	public void setTempMeasured(String tempMeasured) {
		this.tempMeasured = tempMeasured;
	}

	public String getStarDistance() {
		return starDistance;
	}

	public void setStarDistance(String starDistance) {
		this.starDistance = starDistance;
	}

	public String getStarDistanceErrorMin() {
		return starDistanceErrorMin;
	}

	public void setStarDistanceErrorMin(String starDistanceErrorMin) {
		this.starDistanceErrorMin = starDistanceErrorMin;
	}

	public String getStarDistanceErrorMax() {
		return starDistanceErrorMax;
	}

	public void setStarDistanceErrorMax(String starDistanceErrorMax) {
		this.starDistanceErrorMax = starDistanceErrorMax;
	}

	public String getInclination() {
		return inclination;
	}

	public void setInclination(String inclination) {
		this.inclination = inclination;
	}

	public String getInclinationErrorMin() {
		return inclinationErrorMin;
	}

	public void setInclinationErrorMin(String inclinationErrorMin) {
		this.inclinationErrorMin = inclinationErrorMin;
	}

	@Override
	public String toString() {
		return "Planet [planetName=" + planetName + ", starName=" + starName + ", publicationStatus="
				+ publicationStatus + ", yearDiscovered=" + yearDiscovered + ", mass=" + mass + ", massErrorMin="
				+ massErrorMin + ", massErrorMax=" + massErrorMax + ", radius=" + radius + ", radiusErrorMin="
				+ radiusErrorMin + ", radiusErrorMax=" + radiusErrorMax + ", period=" + period + ", periodErrorMin="
				+ periodErrorMin + ", periodErrorMax=" + periodErrorMax + ", tempCalculated=" + tempCalculated
				+ ", tempMeasured=" + tempMeasured + ", starDistance=" + starDistance + ", starDistanceErrorMin="
				+ starDistanceErrorMin + ", starDistanceErrorMax=" + starDistanceErrorMax + ", inclination="
				+ inclination + ", inclinationErrorMin=" + inclinationErrorMin + "]";
	}

}
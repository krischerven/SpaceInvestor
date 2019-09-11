package co.gc.space.entity.planet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "exoplanets")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

	@Id

	@Column(name = "planetname")
	private String planetName;

	@Column(name = "starname")
	private String starName;
	@Column(name = "publicationstatus")
	private String publicationStatus;
	@Column(name = "yeardiscovered")
	private String yearDiscovered;
	private String mass;
	@Column(name = "masserrormin")
	private String massErrorMin;
	@Column(name = "masserrormax")
	private String massErrorMax;
	private String radius;
	@Column(name = "radiuserrormin")
	private String radiusErrorMin;
	@Column(name = "radiuserrormax")
	private String radiusErrorMax;
	private String period;
	@Column(name = "perioderrormin")
	private String periodErrorMin;
	@Column(name = "perioderrormax")
	private String periodErrorMax;
	@Column(name = "tempcalculated")
	private String tempCalculated;
	@Column(name = "tempmeasured")
	private String tempMeasured;
	@Column(name = "stardistance")
	private String starDistance;
	@Column(name = "stardistanceerrormin")
	private String starDistanceErrorMin;
	@Column(name = "stardistanceerrormax")
	private String starDistanceErrorMax;
	private String inclination;
	@Column(name = "inclinationerrormin")
	private String inclinationErrorMin;

	@Transient
	private String imageUrl;
	@Transient
	private String jspTag;

	public Planet() {
		super();
		// TODO Auto-generated constructor stub

	}

	public String getJspTag() {
		return jspTag;
	}

	public void setJspTag(String jspTag) {
		this.jspTag = jspTag;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
		if (this instanceof SolarSystemPlanet || mass.equals("nan")) {
			return mass;
		} else {
			return mass + " Mj";
		}
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
		if (this instanceof SolarSystemPlanet || radius.equals("nan")) {
			return radius;
		} else {
			return radius + " Rj";
		}
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
		if (this instanceof SolarSystemPlanet || period.equals("nan")) {
			return period;
		} else {
			return period + " days";
		}
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
		if (this instanceof SolarSystemPlanet || tempCalculated.equals("nan")) {
			return tempCalculated;
		} else {
			return tempCalculated + " K";
		}
	}

	public void setTempCalculated(String tempCalculated) {
		this.tempCalculated = tempCalculated;
	}

	public String getTempMeasured() {
		if (this instanceof SolarSystemPlanet || tempMeasured.equals("nan")) {
			return tempMeasured;
		} else {
			return tempMeasured + " K";
		}
	}

	public void setTempMeasured(String tempMeasured) {
		this.tempMeasured = tempMeasured;
	}

	public String getStarDistance() {
		if (this instanceof SolarSystemPlanet || starDistance.equals("nan")) {
			return starDistance;
		} else {
			return starDistance + " pc";
		}
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
		return "<h2>" + planetName + "</h2><a href=" + getJspTag() + "><img src=" + getImageUrl()
				+ " + alt=hello height=" + 600 + " width=" + 600 + "> </a>";
	}

}
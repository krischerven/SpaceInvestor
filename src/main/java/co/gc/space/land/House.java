package co.gc.space.land;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Planet;

@Entity
@Table(name = "houses")
@JsonIgnoreProperties(ignoreUnknown = true)
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	protected String price;
	protected String arces;
	@Column(name = "propertydetails")
	protected String propertyDetails;
	@Column(name = "housefeatures")
	protected String houseFeatures;
	@Column(name = "architecturalstyle")
	protected String architecturalStyle;
	@Column(name = "mycondition")
	protected String condition;
	@Column(name = "yearbuilt")
	protected String yearBuilt;
	@Column(name = "houseimage")
	private String houseImage;
	@Transient private Planet planet;
	@Transient private House other;
	@Column(name="planet_name")
	private String planetName;
	@Column(name="user_id")
	private Integer userId;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public House() {
		super();
	}

	public House From(final House other) {
		this.price = other.price;
		this.arces = other.arces;
		this.propertyDetails = other.propertyDetails;
		this.houseFeatures = other.houseFeatures;
		this.architecturalStyle = other.architecturalStyle;
		this.condition = other.condition;
		this.yearBuilt = other.yearBuilt;
		this.houseImage = other.houseImage;
		this.planet = other.planet;
		this.planetName = other.planet.getPlanetName();
		this.other = other;
		return this;
	}

	public String getHouseImage() {
		return houseImage;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setArces(String arces) {
		this.arces = arces;
	}

	public void setPropertyDetails(String propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public void setHouseFeatures(String houseFeatures) {
		this.houseFeatures = houseFeatures;
	}

	public void setArchitecturalStyle(String architecturalStyle) {
		this.architecturalStyle = architecturalStyle;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public void setHouseImage(String houseImage) {
		this.houseImage = houseImage;
	}

	public String getPrice() {
		return price;
	}

	public String getArces() {
		return arces;
	}

	public String getArchitecturalStyle() {
		return architecturalStyle;
	}

	public String getCondition() {
		return condition;
	}

	public String getPropertyDetails() {
		return propertyDetails;
	}

	public String getHouseFeatures() {
		return houseFeatures;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public Planet getPlanet() {
		return planet;
	}

	public House setPlanet(Planet planet) {
		this.planet = planet;
		return this;
	}

	public HouseEnum toEnum() {
		return null;
	}

	public String toString() {
		return (other != null) ? other.toEnum().toString() : toEnum().toString();
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
}

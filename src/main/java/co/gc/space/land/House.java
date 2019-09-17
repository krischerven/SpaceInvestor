package co.gc.space.land;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.gc.space.entity.planet.Planet;
import co.gc.space.user.User;

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
	@Transient
	private Planet planet;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)	
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;
    
	public House() {
		super();
		// TODO Auto-generated constructor stub
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

}

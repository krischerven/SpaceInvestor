package co.gc.space.entity.planet;

import javax.persistence.Transient;

public class SolarSystemPlanet extends Planet {
	
	private String minTemp;
	private String maxTemp;
	@Transient
	private String gifImage;
	

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

	public String getGifImage() {
		return gifImage;
	}

	public void setGifImage(String gifImage) {
		this.gifImage = gifImage;
	}

	
	

}

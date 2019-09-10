package co.gc.space;

public final class Image {
	final String[] urls;
	public Image(String[] _urls) {
		super();
		urls = _urls;
	}
	public String getBestUrl() {
		return urls[urls.length-1];
	}
	// Image builders
	public static Image _47_uma_b() {
		return new Image
		(
				new String[] {"https://upload.wikimedia.org/wikipedia/commons/4/4f/47_Ursae_Majoris_b_v4.jpg"}
		);
	}
	public static Image _kepler_421_b() {
		return new Image
		(
				new String[] {"https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/hires-kepler-421b_0.jpg"}
		);
	}
	public static Image beta_pic_b() {
		return new Image
		(
				new String[] {"https://upload.wikimedia.org/wikipedia/commons/1/12/Artist%E2%80%99s_impression_of_the_planet_Beta_Pictoris_b.jpg"}
		);
	}
	public static Image beta_pic_c() {
		return new Image
		(
				new String[] {"https://techlapse.com/wp-content/uploads/2019/08/Astronomers-are-discovering-a-new-planet-1280x720.jpg"}
		);
	}
	
}

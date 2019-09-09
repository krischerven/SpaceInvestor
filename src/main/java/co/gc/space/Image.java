package co.gc.space;

public final class Image {
	String[] urls;
	public Image(String[] _urls) {
		super();
		urls = _urls;
	}
	// use conditionals here if an Image instance needs to use another url (maybe one of them broke?)
	public String getBestUrl() {
		return urls[0];
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
	
}

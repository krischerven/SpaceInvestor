package co.gc.space;

public final class Image {
	String[] urls;
	public Image(String[] _urls) {
		super();
		urls = _urls;
	}
	public String[] getUrls() {
		return urls;
	}
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
}

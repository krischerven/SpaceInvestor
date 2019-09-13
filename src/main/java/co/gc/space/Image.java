package co.gc.space;

public final class Image {
	final String[] urls;

	public Image(String[] _urls) {
		super();
		urls = _urls;
	}

	public String getBestUrl() {
		return urls[urls.length - 1];
	}

	// Image builders
	public static Image _47_uma_b() {
		return new Image(new String[] { "../images/47umab.png" });
	}

	public static Image _kepler_421_b() {
		return new Image(new String[] { "../images/kepler-421b.png" });
	}

	public static Image beta_pic_b() {
		return new Image(new String[] { "../images/betapicb.png" });
	}

	public static Image beta_pic_c() {
		return new Image(new String[] { "../images/betapicc.png" });
	}

	public static Image K2_18_b() {
		return new Image(new String[] { "../images/K2-18b.png" });

	}
}

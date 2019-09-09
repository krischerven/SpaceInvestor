package co.gc.space;

public final class Image {
	String remoteUrl;
	String localUrl;
	public Image(String remoteUrl, String localUrl) {
		super();
		this.remoteUrl = remoteUrl;
		this.localUrl = localUrl;
	}
	public String getRemoteUrl() {
		return remoteUrl;
	}
	public void setRemoteUrl(String remoteUrl) {
		this.remoteUrl = remoteUrl;
	}
	public String getLocalUrl() {
		return localUrl;
	}
	public void setLocalUrl(String localUrl) {
		this.localUrl = localUrl;
	}
	public String toString() {
		return localUrl;
	}
	// Image builders
	public static Image _47_uma_b() {
		return new Image
		(
				"https://upload.wikimedia.org/wikipedia/commons/4/4f/47_Ursae_Majoris_b_v4.jpg",
				"images/47_Ursae_Majoris_b_v4.jpg"
				
		);
	}
}

package co.gc.space;
import co.gc.space.entity.planet.Planet;
import co.gc.space.repo.PlanetRepo;

public final class PlanetBuilder {
	public Planet Build(PlanetRepo repo, String name, String imageUrl, String jspUrl) {
		Planet p = repo.findById(name).get();
		p.setImageUrl(imageUrl);
		p.setJspTag(jspUrl);
		return p;
	}
	public Planet Build(PlanetRepo repo, String name) {
		String imageUrl = "";
		String jspUrl = "";
		switch (name) {
			case "47 uma b": {
				imageUrl = Image._47_uma_b().getBestUrl();
				jspUrl = "/planets/47_uma_b";
				return Build(repo, name, imageUrl, jspUrl);
			}
			case "kepler-421 b": {
				imageUrl = Image._kepler_421_b().getBestUrl();
				jspUrl = "/planets/kepler-421_b";
				return Build(repo, name, imageUrl, jspUrl);
			}
		}
		return null;
	}
}

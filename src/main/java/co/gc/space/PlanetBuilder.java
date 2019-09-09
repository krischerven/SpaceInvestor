package co.gc.space;
import org.springframework.beans.factory.annotation.Autowired;
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
				imageUrl = Image._47_uma_b().getLocalUrl();
				jspUrl = "/planets/47_uma_b";
				return Build(repo, name, imageUrl, jspUrl);
			}
		}
		return null;
	}
}

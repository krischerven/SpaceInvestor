package co.gc.space;

import org.springframework.beans.factory.annotation.Autowired;

import co.gc.space.controller.ControllerHelper;
import co.gc.space.entity.planet.Planet;
import co.gc.space.repo.PlanetRepo;

public final class PlanetBuilder {

	public static Planet Build(String name, String imageUrl, String jspUrl) {
		Planet p = ControllerHelper.repo.findById(name).get();
		p.setImageUrl(imageUrl);
		p.setJspTag(jspUrl);
		return p;
	}

	public static Planet Build(String name) {
		String imageUrl = null;
		String jspUrl = null;
		
		switch (name) {
			case "47 uma b": {
				imageUrl = Image._47_uma_b().getBestUrl();
				jspUrl = "/planets/47_uma_b";
				break;
			}
			case "kepler-421 b": {
				imageUrl = Image._kepler_421_b().getBestUrl();
				jspUrl = "/planets/kepler-421_b";
				break;
			}
			case "beta pic b": {
				imageUrl = Image.beta_pic_b().getBestUrl();
				jspUrl = "/planets/beta_pictoris_b";
				break;
			}
			case "beta pic c": {
				imageUrl = Image.beta_pic_c().getBestUrl();
				jspUrl = "/planets/beta_pictoris_c";
				break;
			}
			case "K2-18 b": {
				imageUrl = 	Image.K2_18_b().getBestUrl();
				jspUrl = "/planets/k2_18";
				break;
			}
			case "K2-3 c": {
			imageUrl = Image.K2_3().getBestUrl();
			jspUrl = "/planets/k2_3";
			break;
			
		}
			case "Trappist-1 h": {
				imageUrl = Image.Trappist_1().getBestUrl();
				jspUrl = "/planets/trappist-1h"; 
				break;
			
			}
			
			
		
		}
		
		if (imageUrl == null) {
			return null;
		} else {
			return Build(name, imageUrl, jspUrl);
		}
		
	}
}

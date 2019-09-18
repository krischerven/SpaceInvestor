package co.gc.space.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.gc.space.repo.PlanetRepo;

@Component
public class ControllerHelper {
	public static PlanetRepo repo;

	@Autowired
	private PlanetRepo autoRepo;

	@PostConstruct
	private void init() {
		repo = autoRepo;
	}
}
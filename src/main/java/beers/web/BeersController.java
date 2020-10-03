package beers.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import beers.object.Beer;
import beers.object.SubType;
import beers.object.Type;

@RestController
@RequestMapping(path = "/beers")
public class BeersController {
	private List<Beer> beers = new ArrayList<Beer>();

	public BeersController() {
		this.setBeers();
	}

	/**
	 * Define the beers in a class variable
	 */
	private void setBeers() {
		this.beers.add(new Beer("Kwak", "Belgium", (float) 8.4, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Bush Blond Tripel", "Belgium", (float) 10.5, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Chouffe", "Belgium", (float) 8, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Duvel", "Belgium", (float) 8.5, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Delirium Tremens", "Belgium", (float) 8.5, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Rince Cochon", "Belgium", (float) 8.5, Type.ALE, SubType.PALE_ALE));
		this.beers.add(new Beer("Barbar", "Belgium", (float) 8, Type.ALE, SubType.PALE_ALE));

		this.beers.add(new Beer("Chimay bleue", "Belgium", (float) 9, Type.ALE, SubType.TRAPPIST));
		this.beers.add(new Beer("Westmalle Tripel", "Belgium", (float) 9.5, Type.ALE, SubType.TRAPPIST));
		this.beers.add(new Beer("Orval", "Belgium", (float) 6.2, Type.ALE, SubType.TRAPPIST));

		this.beers.add(new Beer("Leffe BLOND", "Belgium", (float) 6.6, Type.ALE, SubType.ABBAYE));
		this.beers.add(new Beer("Saint Feuillien", "Belgium", (float) 7.5, Type.ALE, SubType.ABBAYE));
		this.beers.add(new Beer("Affligen Blond", "Belgium", (float) 6.7, Type.ALE, SubType.ABBAYE));

		this.beers.add(new Beer("Delta IPA", "Belgium", (float) 6.5, Type.ALE, SubType.IPA));
		this.beers.add(new Beer("BRLO IPA", "Germany", (float) 7, Type.ALE, SubType.IPA));
		this.beers.add(new Beer("Hellfest IPA", "France", (float) 6.6, Type.ALE, SubType.IPA));

		this.beers.add(new Beer("1664", "France", (float) 6.3, Type.LAGER, SubType.PALE_LAGER));
		this.beers.add(new Beer("Jupiler", "Belgium", (float) 5.2, Type.LAGER, SubType.PALE_LAGER));
		this.beers.add(new Beer("Heineken", "Belgium", (float) 5, Type.LAGER, SubType.PALE_LAGER));

		this.beers.add(new Beer("Cuvée des trolls", "Belgium", (float) 7, Type.ALE, SubType.OTHER));
		this.beers.add(new Beer("Bière de miel", "Belgium", (float) 8, Type.ALE, SubType.OTHER));
		this.beers.add(new Beer("Paix Dieu", "Belgium", (float) 10, Type.ALE, SubType.OTHER));
		this.beers.add(new Beer("Tripel Karmeliet", "Belgium", (float) 8.4, Type.ALE, SubType.OTHER));

		this.beers.add(new Beer("Guinness", "Belgium", (float) 8, Type.STOUT, SubType.OTHER));
	}

	/*
	 * Get the beers that are hard coded.
	 * Examples :
	 * 1) http://localhost:4242/beers
	 * 2) http://localhost:4242/beers?type=lager
	 * 3) http://localhost:4242/beers?type=ale&subtype=trappist
	 */
	@GetMapping()
	public List<Beer> getSpecificType(@RequestParam(name = "type", required = false) String type,
			@RequestParam(name = "subtype", required = false) String subtype) {
		if (type != null && subtype == null)
			return this.beers.stream().filter(beer -> beer.getType().getTypeName().equals(type))
					.collect(Collectors.toList());
		else if (type != null && subtype != null) {
			return this.beers.stream().filter((beer) -> beer.getType().getTypeName().equals(type) && true
					&& beer.getSubType().getSubTypeName().equals(subtype)).collect(Collectors.toList());
		} else
			return (this.beers);
	}
}
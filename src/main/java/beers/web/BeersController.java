package beers.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beers.domain.Beer;

@RestController
@RequestMapping(path = "/beers")
public class BeersController {
	private static Logger logger = Logger.getLogger(BeersController.class);

	/*
	 * Get all the beers URL : /beers
	 */
	@GetMapping
	public List<Beer> getAllBeers() {
		List<Beer> beers = new ArrayList<Beer>();
		logger.info("Begin " + new Object() {
		}.getClass().getEnclosingMethod().getName() + " method");
		// List<String> beers = new ArrayList<>();
		Beer beer1 = new Beer("Triple Karmeliet", "Belgique", (float) 8.4);
		Beer beer2 = new Beer("Delirium", "Belgique", (float) 8.5);
		Beer beer3 = new Beer("Rince Cochon", "Belgique", (float) 8.5);
		Beer beer4 = new Beer("Paix Dieu", "Belgique", (float) 10);
		Beer beer5 = new Beer("Barbar", "Belgique", (float) 8);
		beers.add(beer1);
		beers.add(beer2);
		beers.add(beer3);
		beers.add(beer4);
		beers.add(beer5);
		return beers;
	}
}
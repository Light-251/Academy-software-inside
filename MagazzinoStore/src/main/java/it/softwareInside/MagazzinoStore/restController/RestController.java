package it.softwareInside.MagazzinoStore.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import it.softwareInside.MagazzinoStore.models.Item;
import it.softwareInside.MagazzinoStore.services.ItemService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired // inizializza automaticamente la classe ItemService perché ha l'annotazione
				// @Service
	ItemService itemService;

	@PostMapping("/add-item")
	public boolean addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}

	@PostMapping("/update-item")
	public boolean updateItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}

	@PostMapping("/get-all-data")
	public Iterable<Item> getAllData() {
		return itemService.getAllData();
	}

	@PostMapping("/valore-totale")
	public double getValoreTotale() {
		return itemService.getValoreTot();
	}

	@DeleteMapping("/remove-item")
	public Item removeItem(@RequestParam int id) {
		return itemService.removeItem(id);

	}
}

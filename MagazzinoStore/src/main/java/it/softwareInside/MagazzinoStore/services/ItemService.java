package it.softwareInside.MagazzinoStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.softwareInside.MagazzinoStore.models.Item;
import it.softwareInside.MagazzinoStore.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	/**
	 * Aggiunge un oggetto al database, se l'aggiunta va a buon fine ritorna true
	 * altrimenti ritorna false
	 * 
	 * @param item
	 * @return
	 */
	public boolean addItem(Item item) {
		if (item == null)
			return false;

		try {
			itemRepository.save(item);
			return true;
		} catch (Exception e) {
			System.out.println("ECCEZZIONE: " + e);
			return false;
		}

	}

	/**
	 * Aggiorna un item nel database specificando l'indice quando si fa la richiesta
	 * 
	 * @param item
	 * @return
	 */
	public boolean update(Item item) {
		return addItem(item);
	}

	/**
	 * Rimuove un item dal database specificando l'indice
	 * 
	 * @param id
	 * @return
	 */
	public Item removeItem(int id) {
		try {
			Item item = itemRepository.findById(id).get();
			itemRepository.deleteById(id);
			return item;
		} catch (Exception e) {
			System.err.println("Eccezzione: " + e);
			return null;
		}

	}

	/**
	 * Ritorna un oggetto di tipo Iterable che contiene tutti gli item nel database
	 * 
	 * @return
	 */
	public Iterable<Item> getAllData() {
		return itemRepository.findAll();
	}

	/**
	 * Ritorna il valore totale di tutti gli item nel database
	 * 
	 * @return
	 */
	public double getValoreTot() {
		double somma = 0;
		for (Item item : getAllData()) {
			somma += item.getCosto();
		}
		return somma;
	}

}

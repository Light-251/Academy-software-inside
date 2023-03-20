package it.softwareInside.MagazzinoStore.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository; -> vedi riga 8

import it.softwareInside.MagazzinoStore.models.Item;

// @Repository -> L'annotazione @Repository si può omettere nelle nuove versioni
public interface ItemRepository extends CrudRepository<Item, Integer> {

}

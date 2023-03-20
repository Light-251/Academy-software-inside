package it.softwareInside.LezioneAcademy21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.LezioneAcademy21.models.Persona;
import it.softwareInside.LezioneAcademy21.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	public boolean addToDatabase(Persona persona) {

		if (persona == null)
			return false;

		try {

			personaRepository.save(persona);

			return true;
		} catch (Exception e) {
			return false;
		}
		/*
		 * Per fare un update si può rifare l'aggiunta e specificare l'id corretto e
		 * viene sovrascritto
		 * se l'id non viene specificato viene aggiunto un nuovo record
		 * 
		 */
	}
}

package it.softwareInside.LezioneAcademy21.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import it.softwareInside.LezioneAcademy21.models.Persona;
import it.softwareInside.LezioneAcademy21.repository.PersonaRepository;
import it.softwareInside.LezioneAcademy21.service.PersonaService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	PersonaService personaService;

	@PostMapping("/hello")
	public String saluta(@RequestBody String nome) {
		return "metodo post " + nome;
	}

	@PostMapping("/crea")
	public boolean creaPersona(@RequestBody Persona persona) {
		System.out.println("#########");
		System.out.println(persona);

		return true;
	}

	@Autowired
	PersonaRepository personaRepository;

	@GetMapping("/rimuovi-persona")
	public Persona deletePersona(@RequestParam("id") int id) {

		Persona persona = personaRepository.findById(id).get();
		personaRepository.deleteById(id);

		return persona;

	}

	@GetMapping("/rimuovi-tutti")
	public boolean deleteAll(@RequestParam("pass") String pass) {
		String myPass = "123456";

		if (!pass.equals(myPass))
			return false;

		try {

			personaRepository.deleteAll();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@GetMapping("/crea-persona")
	public boolean creaPersona(@RequestParam("nome") String nome, @RequestParam("telefono") String telefono) {

		if (nome == null || nome.isEmpty() || telefono == null || telefono.isEmpty())
			return false;

		try {
			personaRepository.save(new Persona(nome, telefono));

			return true;
		} catch (Exception e) {
			System.out.println("ECCEZIONE: " + e);
			return false;
		}
	}

	@GetMapping("/save-test")
	public boolean saveTest() {

		try {
			Persona p1 = new Persona();
			p1.setNome("Mario");
			p1.setTelefono("3333333333");

			personaRepository.save(p1);

			return true;

		} catch (Exception e) {
			System.err.println("ECCEZIONE: " + e);
			return false;
		}

	}
}

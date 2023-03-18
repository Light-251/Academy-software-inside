package it.softwareinside.app.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

	@GetMapping("/pari-dispari")
	public boolean isPari(@RequestParam(name="n") int numero) {
		return numero % 2 == 0;
	}
	
	@GetMapping("/divisione")
	public int divisione (@RequestParam("n1") int numero1, @RequestParam("n2") int numero2){
		int divisione;
		
		try {
			divisione = numero1 / numero2;
			return divisione;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	@GetMapping("/divisione2")
	public String divisione2 (@RequestParam("n1") String numero1, @RequestParam("n2") String numero2){
		int divisione;
		
		try {
			divisione = Integer.parseInt(numero1) / Integer.parseInt(numero2);
			return divisione + "";
		}
		catch (NumberFormatException e) {
			return "Errore di conversione da String a int";
		}
		catch (ArithmeticException e) {
			return "Non puoi dividere per 0 ";
		}
		catch (Exception e) {
			return "OPS";
		}
		
	}
}

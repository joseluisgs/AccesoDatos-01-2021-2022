package es.joseluisgs.dam.util;

import java.util.Map;
import java.util.Optional;

import es.joseluisgs.dam.model.TemperaturaHora;

public class PrintUtil {

	public static void printMapProvinciaTemperaturaHora(Map<String, Optional<TemperaturaHora>> map) {

		// Una forma de imprimir un map de forma ordenada
		map.keySet().stream().sorted().forEach(provincia -> {
			TemperaturaHora t = map.get(provincia).get();
			System.out.printf("Provincia: %-25s | Temperatura: % 6.2fºC | Hora: %s%n", provincia, t.getTemperatura(),
					t.getHora().toString());
		});
		System.out.println("");
	}

}

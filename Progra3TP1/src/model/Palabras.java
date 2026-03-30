package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("perro", "casas", "viejo", "sonar"));
	//private final static Set<String> palabrasWordle = new HashSet<>();
	
	public static String obtenerPalabraRandom() {


//		for (String string : palabrasWordle) {
//			palabrasWordle.add(string);
//		}
		Random random = new Random();
		int numRandom = random.nextInt(palabrasWordle.size());
		String[] palabras = palabrasWordle.toArray(new String[palabrasWordle.size()]);
		return palabras[numRandom];
	}
	
	public static boolean verificarExistenciaPalabra(String palabra) {
		return palabrasWordle.contains(palabra);
	}
}

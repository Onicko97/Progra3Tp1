package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("PERRO", "CASAS", "VIEJO", "SONAR"));
//	private final static HashSet<String> palabrasWordle = new HashSet<>();
//	private final static String[] listaPalabras = {"PERRO", "CASAS", "VIEJO", "SONAR"};
	
	public static String obtenerPalabraRandom() {
//		for (String string : listaPalabras) {
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
	
	public static String[] stringToArray(String word) {
		return word.split("");
	}
}

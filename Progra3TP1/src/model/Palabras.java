package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("PERRO", "CASAS", "VIEJO", "SONAR"));
	private final static Set<String> palabrasWordleEnglish = new HashSet<>(Set.of("CASES", "PAIRS", "HOVER", "SOUND"));
//	private final static HashSet<String> palabrasWordle = new HashSet<>();
//	private final static String[] listaPalabras = {"PERRO", "CASAS", "VIEJO", "SONAR"};
	
	public static String obtenerPalabraRandom(String idioma) {
//		for (String string : listaPalabras) {
//			palabrasWordle.add(string);
//		}
		Random random = new Random();
		int numRandom = random.nextInt(palabrasWordle.size());
		if(idioma.equals("Español")) {
			String[] palabras = palabrasWordle.toArray(new String[palabrasWordle.size()]);
			return palabras[numRandom];
		}else {
			String[] palabras = palabrasWordleEnglish.toArray(new String[palabrasWordleEnglish.size()]);
			return palabras[numRandom];
		}
	}
	
	public static boolean verificarExistenciaPalabra(String palabra) {
		return palabrasWordle.contains(palabra) || palabrasWordleEnglish.contains(palabra); //ineficiente
	}
	
	public static String[] stringToArray(String word) {
		return word.split("");
	}
}

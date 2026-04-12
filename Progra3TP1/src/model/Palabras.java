package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("PERRO", "CASAS", "VIEJO", "SONAR"));
	private final static Set<String> palabrasWordleDificil = new HashSet<>(Set.of("COLMENA", "SOLDADO", "CARPETA", "CELULAR"));
	private final static Set<String> palabrasWordleEnglish = new HashSet<>(Set.of("CASES", "PAIRS", "HOVER", "SOUND"));
	private final static Set<String> palabrasWordleEnglishDificil = new HashSet<>(Set.of("COUNTRY", "MORNING", "BELIEVE", "PICTURE", "WEATHER"));
	
//  todo lo comentado es xq mi eclipse viejo no reconoce el comando Set.of 
//	private final static HashSet<String> palabrasWordle = new HashSet<>();
//	private final static String[] listaPalabras = {"PERRO", "CASAS", "VIEJO", "SONAR"};
//	private final static HashSet<String> palabrasWordleDificil = new HashSet<>();
//	private final static String[] listaPalabrasDificil = {"COLMENA", "SOLDADO", "CARPETA", "CELULAR"};
//	private final static HashSet<String> palabrasWordleEnglish = new HashSet<>();
//	private final static String[] listaPalabrasEnglish = {"CASES", "PAIRS", "HOVER", "SOUND"};
	
	public static String obtenerPalabraRandom(int dificultad, String idioma) {
		Random random = new Random();
		if(dificultad == 0) {
			if(idioma.equals("Español")) {
				int numRandom = random.nextInt(palabrasWordle.size());
				String[] palabras = palabrasWordle.toArray(new String[palabrasWordle.size()]);
				return palabras[numRandom];
			}
			else {
				int numRandom = random.nextInt(palabrasWordleEnglish.size());
				String[] palabras = palabrasWordleEnglish.toArray(new String[palabrasWordleEnglish.size()]);
				return palabras[numRandom];
			}
		}
		else {
			if(idioma.equals("Español")) {
				int numRandom = random.nextInt(palabrasWordleDificil.size());
				String[] palabras = palabrasWordleDificil.toArray(new String[palabrasWordleDificil.size()]);
				return palabras[numRandom];
			}
			else {
				int numRandom = random.nextInt(palabrasWordleEnglishDificil.size());
				String[] palabras = palabrasWordleEnglishDificil.toArray(new String[palabrasWordleEnglishDificil.size()]);
				return palabras[numRandom];
			}
		}
	}
	
	public static boolean verificarExistenciaPalabra(String palabra) {
		return palabrasWordle.contains(palabra) || palabrasWordleEnglish.contains(palabra); //ineficiente
	}
	
	public static String[] stringToArray(String word) {
		return word.split("");
	}
	
//  todo lo comentado es xq mi eclipse viejo no reconoce el comando Set.of 
//	public static void guardarPalabras() {
//		for (String string : listaPalabras) {
//			palabrasWordle.add(string);
//		}
//		for (String string : listaPalabrasDificil) {
//			palabrasWordleDificil.add(string);
//		}
//		for (String string : listaPalabrasEnglish) {
//			palabrasWordleEnglish.add(string);
//		}
//	}
}

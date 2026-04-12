package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("PERRO", "CASAS", "VIEJO", "SONAR"));
	private final static Set<String> palabrasWordleDificil = new HashSet<>(Set.of("COLMENA", "SOLDADO", "CARPETA", "CELULAR"));
	
//  todo lo comentado es xq mi eclipse viejo no reconoce el comando Set.of 
//	private final static HashSet<String> palabrasWordle = new HashSet<>();
//	private final static String[] listaPalabras = {"PERRO", "CASAS", "VIEJO", "SONAR"};
//	private final static HashSet<String> palabrasWordleDificil = new HashSet<>();
//	private final static String[] listaPalabrasDificil = {"COLMENA", "SOLDADO", "CARPETA", "CELULAR"};
	
	public static String obtenerPalabraRandom(int dificultad) {
		Random random = new Random();
		if(dificultad == 0) {
			int numRandom = random.nextInt(palabrasWordle.size());
			String[] palabras = palabrasWordle.toArray(new String[palabrasWordle.size()]);
			return palabras[numRandom];
		}
		else {
			int numRandom = random.nextInt(palabrasWordleDificil.size());
			String[] palabras = palabrasWordleDificil.toArray(new String[palabrasWordleDificil.size()]);
			return palabras[numRandom];
		}
	}
	
	public static boolean verificarExistenciaPalabra(String palabra) {
		return palabrasWordle.contains(palabra);
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
//	}
}

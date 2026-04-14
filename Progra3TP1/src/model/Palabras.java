package model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Palabras {

	private final static Set<String> palabrasWordle = new HashSet<>(Set.of("PERRO", "CASAS", "VIEJO", "SONAR","ARBOL", "MASAS", "LIBRO", "PLANO", 
	"SUERO", "PLAYA", "VALOR", "TEXTO", "RADIO", "GENTE", "FORMA", "TIGRE", "VERDE", "NUBES", "BRAZO", "MENTE"));
	
	private final static Set<String> palabrasWordleDificil = new HashSet<>(Set.of("COLMENA", "SOLDADO", "CARPETA", "CELULAR","PLANETA", "TECLADO",
	"CUADROS", "MENSAJE", "TRABAJO", "ENERGIA", "CEREBRO", "CAMINAR", "FUERZAS", "DERECHO", "DESTINO", "ESCUELA", "MEMORIA", "TIEMPOS", "VENTANA", "RELOJES"));
	
	private final static Set<String> palabrasWordleEnglish = new HashSet<>(Set.of("CASES", "PAIRS", "HOVER", "SOUND","TABLE", "HOUSE", "WATER", "LIGHT", 
			"BREAD", "NIGHT", "GRASS", "HEART", "PIANO", "FRUIT", "PLANE", "WORLD", "DREAM", "CLOCK", "SPACE", "MUSIC"));
	
	private final static Set<String> palabrasWordleEnglishDificil = new HashSet<>(Set.of("WEATHER", "MORNING", "BELIEVE", "PICTURE", "BETWEEN", 
			"COUNTRY", "THROUGH", "STUDENT", "THOUGHT", "FRIENDS", "PROCESS", "WORKING", "KITCHEN", "NOTHING", "PERFECT", "EXAMPLE","FREEDOM", "HISTORY", 
			"SCIENCE", "LIBRARY"));
	

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
	    String palabraMin = palabra.trim().toUpperCase(); 
	    return palabrasWordle.contains(palabraMin) || palabrasWordleEnglish.contains(palabraMin) 
	    	|| palabrasWordleDificil.contains(palabraMin) || palabrasWordleEnglishDificil.contains(palabraMin);
	}
	
	public static String[] stringToArray(String word) {
		return word.split("");
	}
	

}

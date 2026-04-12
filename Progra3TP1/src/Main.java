import model.Tablero;
import presenter.JuegoPresenter;
import view.SeleccionIdioma;
import view.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		SeleccionIdioma ventanaIdioma = new SeleccionIdioma();
		ventanaIdioma.setModal(true);
		ventanaIdioma.setVisible(true);
		String idioma = ventanaIdioma.getIdiomaSeleccionado();
		
		VentanaPrincipal ventana = new VentanaPrincipal(idioma);
		Tablero modelo = new Tablero(idioma);
		JuegoPresenter juego = new JuegoPresenter(ventana, modelo);
		juego.iniciar();
	}
}


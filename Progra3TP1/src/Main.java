import model.Tablero;
import presenter.JuegoPresenter;
import view.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		Tablero modelo = new Tablero();
		JuegoPresenter juego = new JuegoPresenter(ventana, modelo);
		juego.iniciar();
	}
}


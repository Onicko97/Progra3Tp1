import presenter.JuegoPresenter;
import view.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		JuegoPresenter juego = new JuegoPresenter(ventana);
		juego.iniciar();
	}
}

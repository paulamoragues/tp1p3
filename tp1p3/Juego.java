package tp1p3;
// esta clase es para probar el funcionamiento de la logica sin la interfaz
// provisorio 

import java.util.Scanner;

public class Juego {
	private Grilla grilla;

	public Juego() {
		grilla = new Grilla();
	}

	public void jugarTurno(int fila, int columna) {
		grilla.clickearCelda(fila, columna);
	}

	public void mostrarEstado() {
		grilla.mostrarGrilla();
	}

	public boolean estaCompleta() {
		return grilla.estaCompleta();
	}

	public static void main(String[] args) {
		Juego juego = new Juego();
		Scanner scanner = new Scanner(System.in);

		while (!juego.estaCompleta()) {
			juego.mostrarEstado();
			System.out.println("ingresa fila y columna entre 0 y 4: ");
			int fila = scanner.nextInt();
			int columna = scanner.nextInt();

			juego.jugarTurno(fila, columna);
		}

		System.out.println("felitaciones, ganaste");
	}
}
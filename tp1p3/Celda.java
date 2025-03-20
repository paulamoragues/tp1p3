package tp1p3;

import java.awt.Color;
import java.util.Random;

public class Celda {
	private int color;
	private static final int coloresPosibles = 6;
	
	// provisorio
	private static final Color[] paletaColores = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE,
			Color.MAGENTA };

	public Celda() {
		this.color = -1; // -1 significa sin color
	}

	public void cambiarColor() {
		Random rand = new Random();
		this.color = rand.nextInt(coloresPosibles);
	}

	public void apagar() {
		this.color = -1;
	}
	
	public int getColor() {
		return color;
	}

	// provisorio
	public Color getColorVisual() {
		return color == -1 ? Color.LIGHT_GRAY : paletaColores[color];
	}

	
}
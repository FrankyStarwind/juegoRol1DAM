package personajes;

public class Tablero {

	private Guerrero g1;

	public Tablero() {

	}

	public Tablero(Guerrero g1) {
		this.g1 = g1;

	}

	/*
	 * public Guerrero crearPersonajeGuerrero(String nom, int fuerza,int
	 * agilidad){ g1= new Guerrero(nom,vit, fuerza,agilidad); return g1; }
	 */
	public int realizarTirada() {
		int res = 0;
		int min = 1;
		int max = 20;
		res = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return res;
	}

	public boolean realizarMovivimiento(int tirada) {
		return g1.realizarMovimientoGuerrero(tirada);
	}

	public void mostrarDatosPersonaje() {
		g1.mostrarDatosPersonaje();
	}

	public Guerrero[] crearGuerrerosEnemigos() {

		Guerrero[] guardiaReal = new Guerrero[3];
		int fuerza = 0;
		int vit = 0;
		int agilidad = 0;

		for (int i = 0; i < guardiaReal.length; i++) {

			fuerza = 9;
			agilidad = 14;
			vit = vit + vit * (i + 1) * 10;

			guardiaReal[i] = new Guerrero("Guarda " + i + 1, fuerza, vit,
					agilidad);
		}
		return guardiaReal;
	}

	public boolean pasarTurno(boolean turn) {
		boolean turno = false;
		if (turno == false) {
			turno = true;
		} else {
			turno = false;
		}
		return turno;
	}

}

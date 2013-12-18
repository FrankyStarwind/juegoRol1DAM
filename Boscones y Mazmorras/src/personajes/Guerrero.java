package personajes;

public class Guerrero {

	private String nombre;
	private int fuerza;
	private int vitalidad;
	private int agilidad;

	public Guerrero() {

	}

	public Guerrero(String nom, int fu, int vit, int ag) {
		nombre = nom;
		fuerza = fu;
		vitalidad = vit;
		agilidad = ag;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public boolean realizarliberarArmadura() {
		boolean res = false;
		int cont = 0;
		int cantidadCoste = 20;
		int redTirada = 2;

		if (cont == 0) {
			this.vitalidad = this.vitalidad - cantidadCoste;
			this.fuerza = this.fuerza - redTirada;
			System.out.println("");

			res = true;

		} else {
			System.out.println("Solo puedes usarlo una vez por combate.");
		}
		return res;
	}

	public boolean realizarMovimientoGuerrero(int tirada){
		boolean res=false;
		if(tirada>=this.fuerza){
			res=true;
			System.out.println("¡Filo devastador!");
		}
		return res;
	}
	public int realizarFiloDevastador() {
		int res = 0;
		res = 20;
		return res;
	}

	public int recibirDanyo(boolean res, int danyo) {
		if (res == true) {
			this.vitalidad = this.vitalidad - danyo;

			System.out.printf("Ha recibido %d de daño. Su vitalidad es"
					+ " de %d VIT", danyo, this.vitalidad);
		}
		return this.vitalidad;
	}

	public void mostrarDatosPersonaje() {
		System.out.println("Eres "+this.nombre+", un guerrero con "+
				((20-this.fuerza)*10)
				+ " de fuerza, con "+this.vitalidad+" de vitalidad y "+((20-this.agilidad)*10)+" de agilidad"
				);
	}
}

package personajes;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero t1;
		Guerrero j1;
		
		int fuerza=0; 
		int vit=0;
		int agilidad=0;
		int dano=0;
		int resultado=0;
		
		boolean res=false;
		String nombre="";
		
		System.out.println("Por favor introduzca el nombre de su personaje"); 
		nombre=Leer.dato();
		
		fuerza=9;
		vit=120;
		agilidad=14;
		j1= new Guerrero(nombre,fuerza, vit,agilidad); 
		t1= new Tablero(j1);
		Guerrero j2= new Guerrero(nombre,fuerza, vit,agilidad);
		
		t1.mostrarDatosPersonaje();
		resultado=t1.realizarTirada();
		System.out.println("El resultado es "+resultado);
		res=t1.realizarMovivimiento(resultado);
		dano=j1.realizarFiloDevastador();
		j2.recibirDanyo(res, dano);
		
		/*
		do {
			
		if (turno==false){
		  
		System.out.println("Le toca al primero");
		
	}else{
		System.out.println("Le toca al segundo");
	}
	
	 turno=t1.pasarTurno(turno);
		} while (j1.getVitalidad()>0 || j2.getVitalidad()>0);
		
		*/
		}
}

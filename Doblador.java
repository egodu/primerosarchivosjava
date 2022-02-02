import java.util.Scanner;

public class Doblador extends Robot implements Servicios {

	private static final int Humo = 0;
	String Origen;
	String Modelo;
	String Nombre;
	int Botin;

	
	
	public Doblador() {
		// TODO Auto-generated constructor stub
		Origen = "México";
		Modelo = "Doblador";
		Nombre = "Bender";
		Botin = 0;

	}

	
	
	/*
	@Override
	public String toString() {
		return Nombre+": Origen=" + Origen + ", Modelo=" + Modelo + ", Botin=" + Botin
				+ ", HumearAmbiente=" + HumearAmbiente + ", AlargarBrazo=" + AlargarBrazo + ", Bateria=" + Bateria
				+ ", Encendido=" + Encendido + "]";
	}
*/



	@Override
	public void Beber() {
		// TODO Auto-generated method stub
		Bateria = Bateria+10;
		System.out.println("- BENDER: (eructa fuego)");
		
	}


	@Override
	public void Robar() {
		// TODO Auto-generated method stub
		Botin = Botin+10;
		System.out.println("BENDER aprovecha la oscuridad y te ha robado un total de: "+Botin+" euros.");
		System.out.println("- BENDER: ¡Jajaja!");
		Bateria = Bateria-10;

		
	}


	@Override
	public void Fumar() {
		// TODO Auto-generated method stub
		//HumearAmbiente = HumearAmbiente+10;
		System.out.println("- BENDER: No hay nada com un buen puro.");
		//System.out.println("Calidad del aire: "+HumearAmbiente);
		Bateria = Bateria-5;
		
		//System.out.println(" ");
		
		//String Aviso = (HumearAmbiente > 50): "Peligro";
		/*
		if (HumearAmbiente >= 30) {
			System.out.println("Hay demasiado humo, apaga pronto el robot.");
			int Humo = 0;
			if (HumearAmbiente >= 40) {
				while (Humo<100) {
					System.out.println("Cuesta respirar. Â¿Apagamos el robot?S/N");
					Scanner preg = new Scanner(System.in);
					String respuesta = preg.nextLine();
					respuesta.toUpperCase();
					if (respuesta.equals("N")) {
						System.out.println("Â¿EstÃ¡s seguro?S/N");
						Humo++; }
					else if (respuesta.equals("S")){
						System.out.println("Apagado el robot, reiniciando valores...");
						HumearAmbiente = 0;
						Encendido = false;
						System.out.println("Calidad del humo: "+HumearAmbiente);
						System.out.println("Encendido: "+Encendido);
					}
						
				
				}}
			
		} */
			
			
		}
	


	@Override
	public void Fiesta() {
		// TODO Auto-generated method stub
		System.out.println("- BENDER: ¡Celebremos el Robohanuka!");
		Bateria = Bateria-30;

		
	}


	@Override
	public void Doblar() {
		// TODO Auto-generated method stub
		System.out.println("- BENDER: Nací para doblar.");
		Bateria = Bateria-20;

	}


	@Override
	public void EntregarPaquete() {
		// TODO Auto-generated method stub
		System.out.println("- BENDER: Besa mi brillante trasero metálico.");
		Bateria = Bateria-30;

	}
	
	public void MirarNiveles() {
		// TODO Auto-generated method stub
		System.out.println("-BENDER: ¿Qué miras, cachocarne?");
		System.out.println("Origen: " + Origen + ", Modelo: " + Modelo + ", Botin: " + Botin+", Bateria: " + Bateria+", Encendido: " + Encendido);
		//System.out.println("Origen: " + Origen + ", Modelo: " + Modelo + ", Botin: " + Botin+", HumearAmbiente: "+ HumearAmbiente +", AlargarBrazo: " + AlargarBrazo + ", Bateria: " + Bateria+", Encendido: " + Encendido);

	}


}

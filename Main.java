import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Iniciar objeto.
		Doblador Bender = new Doblador();
	
		
		//Encender robot.
		Scanner preg = new Scanner(System.in);
		System.out.println("Aquí está BENDER, ¿Quieres encenderlo?S/N");
		String resp1 = preg.nextLine();
		resp1.toUpperCase();
		
		
		if (resp1.equals("S")) {
			Bender.Encendido = true;
			int resp3 = 0;
			System.out.println(" ");
			System.out.print("Hola cachocarne, soy BENDER. ");

			
				
			
				//Empezar acciones
				do {
					System.out.println(" ");
					System.out.println("¿Qué vamos a hacer ahora?");
					System.out.println("1. Vamos a trabajar");
					System.out.println("2. Doblar una viga");
					System.out.println("3. Beber una cerveza");
					System.out.println("4. Descansar");
					System.out.println("5. Salir de fiesta");
					System.out.println("6. Ver una película");
					System.out.println("7. Mirar estado de "+Bender.Nombre.toUpperCase());
					System.out.println("8. Apagar a "+Bender.Nombre.toUpperCase());
					resp3 = preg.nextInt();
					
						switch (resp3) {
						case 1: Bender.EntregarPaquete();
						break;
						case 2: Bender.Doblar();
						break;
						case 3: Bender.Beber();
						break;
						case 4: Bender.Fumar();
						break;
						case 5: Bender.Fiesta();
						break;
						case 6:	Bender.Robar();
						break;
						case 7: Bender.MirarNiveles();
						break;
						default:
						
						}
					
				
						
						//Avisos sobre el nivel de bateria
						if (Bender.Bateria<=30 && Bender.Bateria>=10) {
							System.out.println("¡ATENCIÓN! BENDER está un poco sobrio y se queda sin bateria, dale una cerveza");
							String NivelBateria = (Bender.Bateria<100)? "La bateria es de: "+Bender.Bateria+"%" : "La bateria está al máximo.";
							System.out.println(NivelBateria);
							
						}  else if (Bender.Bateria<=0){
							resp3=8;
							
						} else if (Bender.Bateria>100) {
							Bender.Bateria = 100;
							String NivelBateria = (Bender.Bateria<100)? "La bateria es de: "+Bender.Bateria+"%" : "La bateria está al máximo.";
							System.out.println(NivelBateria);
						} else {
							
						}
						
						//Acciones sobre el botin
						if (Bender.Botin >= 20) {
							System.out.println("- BENDER: Me voy a buscar una robopilingui. ¡Adiós cachocarne!");
							resp3 = 8;
						} else {
							
						}
						
				} while (resp3!=8);
				Bender.Encendido = false;
				System.out.println("BENDER ya no está disponible. ¡Hasta la próxima!");
				
			
		
		} else if (resp1.equals("N")) {
			System.out.println("Vale, pues hasta la próxima.");
		
		} else {
			System.out.println("No te he entendido. Reinicia el sistema.");
		}		
		


	}

}

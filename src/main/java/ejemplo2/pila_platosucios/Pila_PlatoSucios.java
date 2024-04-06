
package ejemplo2.pila_platosucios;
import java.util.Scanner;
import java.util.Stack;
public class Pila_PlatoSucios {
	
	public static void main(String[] args) {
		
		//crear una pila nueva para poder almacenrar los platos sucios
		Stack<String> pilaPlatos = new Stack();
		//crear un objeto para Scanner pueda leer la entrada de usuario
		Scanner scanner = new Scanner(System.in);
		//variable para controlar la salida del cucle
		boolean salir = false;
		
		//iniciamos el bucle While se ejecuta mientras salir sea falso
		
		while (!salir) {
			System.out.println("1. Agregar un plato sucio a la pila");
			System.out.println("2. Lavar el plato superior de la pila");
			System.out.println("3. Ver el plato superior de la pila");
			System.out.println("4. Verificar si la pila esta vacia");
			System.out.println("5. Buscar un plato en la pila");
			System.out.println("6. Salir");
			//solicitat al usuario que ingrese una opción
			System.out.println("Ingrese una opcion");
			//leer la opcion ingresada por el usuario
			int  opcion = scanner.nextInt();
			//consumidor el salto de linea despues de leer la opcion
			scanner.nextLine();
			
			//inicio de bloque Switch
			switch(opcion) {
			case 1:
				//solicitar al usuario que ingrese el plato
				System.out.print("Ingrese el plato a la pila");
				//verificar si la pila no esta vacia
				String plato = scanner.nextLine();
				//agregar el plato a la pula utilizando push()
				pilaPlatos.push(plato);
				//mostrar mensaje indicando que fue ingresando
				System.out.println("Plato agregando a la pila.");
				break;
			case 2:
				//verificar si la pila no esta vacia
				if(!pilaPlatos.isEmpty()) {
					//limpiar el plato superior = eliminarlo con pop)
					String platoLimpio = pilaPlatos.pop();
					System.out.println("se lavo el plato superior: " + platoLimpio );
				}else {
					//indicar que la pila esta vacia
					System.out.println ("la pila esta vacia. No se puede lavar ningun plato");
					
				}
				
				break;
			case 3:
				//verificar si la pila no esta vacia
				if(!pilaPlatos.isEmpty()) {
					//limpiar el plato superior = eliminarlo con pop)
					String platoSuperior = pilaPlatos.pop();
					System.out.println("El plato superior de la pila es: " + platoSuperior );
				}else {
					//indicar que la pila esta vacia
					System.out.println ("la pila esta vacia. Se lavaron los platos");
					
				}
				break;
			case 4:
				boolean estaVacia = pilaPlatos.isEmpty();
				System.out.println("la pila de platos esta vacia: " + estaVacia);
				break;
			case 5:
				//solicitar al usuario ingresar el plato a buscar en ...
				System.out.println("Ingrese el plato que desea buscar: ");
				//leer el plato a buscar por le usuario
				String platoBuscar = scanner.nextLine();
				//Buscar el plato en la pila utilizando en la pila el metodo search()
				int distanciaDesdeSuperior = pilaPlatos.search(platoBuscar);
				//Verificar si el plato se encuentra en la pila (search() devuelve -1 si no se encuentra)
				if(distanciaDesdeSuperior != -1) {
					//Mostrar un mensaje indicando la posicion del plato en la pila
					System.out.println("El plato '" + platoBuscar + "' se encuentra a una destancia de " + distanciaDesdeSuperior + "desde la parte superior de la pila.");
					
				} else {
					//Mostrar un mensaje indicando que el plato no se encuentra en la pila
					System.out.println("El plato '" + platoBuscar + "'se encuentra en la pila. ");
				}
			
				break; //salir del bloque switch
				
			case 6:
				salir = true; //Establecer la variable salir a true para salir del bucle while
				break; //Salir del bloque switch
			
			default:
				System.out.println("Opcion invalida. intente de nuevo");
				break; //Salir del cloque switch
		}
		System.out.println(); //imprimir una linea en blanco para separar las interacciones del bucle while
	}
		System.out.println("¡Hasta Luego!!"); //imprimir una linea en blanco para separar las interacciones del bucle while

}
}
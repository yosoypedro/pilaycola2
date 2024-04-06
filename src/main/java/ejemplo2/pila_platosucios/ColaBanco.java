
package ejemplo2.pila_platosucios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaBanco {
	
	public static void main(String[] arg) {
		//crear una nueva cola utilizando linked list de java
		Queue<String>colaAtencion = new LinkedList<>();
		//crear un objeto scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		//variavle para controlar la salida del bucle while
		boolean salir = false;
		
		while (!salir) {//inicio del bucle while, se ejecula mientras salir sea falso
			System.out.println("--- Bienvenido al programa Colas ---");
			System.out.println("1. Agregar cliente a la cola de atencion");
			System.out.println("2. Atender al proximo cliente en la cola");
			System.out.println("3. Ver al proximo cliente en la cola");
			System.out.println("4. Verificar si la cola de atencion esta vacia");
			System.out.println("5. Salir");
			//Solicitar al usuario que ingrese una opcion
			System.out.println("Ingrese una opcion:");
			//Leer la opcion ingresada por el usuario
			int opcion =scanner.nextInt();
			//Consumir el salto de la linea despues de leer la opcion
			scanner.nextLine();
			
			//Inicio del bloque switch, se evalue el valor de la variable opcion
		switch (opcion) {
		
		case 1:
			//solicitar al usuario que ingrese el plato
			System.out.print("Ingrese el nombre del cliente a agregar a la cola: ");
			//verificar si la pila no esta vacia
			String cliente = scanner.nextLine();
			//agregar el plato a la pula utilizando push()
			colaAtencion.add(cliente);
			//mostrar mensaje indicando que fue ingresando
			System.out.println("Cliente agregado a la cola de atención.");
			break; //salir del bloque switch
			
		case 2:
			//verificar si la pila no esta vacia
			if(!colaAtencion.isEmpty()) {
				//limpiar el plato superior = eliminarlo con pop)
				String clienteAtendido = colaAtencion.poll();
				System.out.println ("Cliente atendido" + clienteAtendido);
				
			} else {
				System.out.println("La cola de atencion esta vacia. No hay clentes por atender.");
			}
			
			break;
		case 3:
			//verificar si la pila no esta vacia
			if(!colaAtencion.isEmpty()) {
				//limpiar el plato superior = eliminarlo con pop)
				String proximoCliente = colaAtencion.peek();
				System.out.println ("Proximo cliente en la cola: " + proximoCliente);
			}else {
				//indicar que la pila esta vacia
				System.out.println ("La cola de atencion esta vacia");
				
			}
			break;
		case 4:
			boolean estaVacia = colaAtencion.isEmpty();
			System.out.println("la cola de atencion esta vacia: " + estaVacia);
			break;
		case 5:
			salir = true;
			break;
			
		default:
			System.out.println("Opción Invalida. Intente nuevamente.");
		}
		System.out.println();
	}
	System.out.println("¡Hasta luego!!");

}
}
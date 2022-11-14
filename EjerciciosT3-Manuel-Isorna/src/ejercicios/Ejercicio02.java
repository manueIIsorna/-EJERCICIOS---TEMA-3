package ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
 * resultado a mostrar es 14:00:01.
 * 
 * @author misorna
 *
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		// Inicialización de variables e declaración
		int hour = 0;
		int min = 0;
		int sec = 0;
		int secIncrement = 0;
		int tester = 0;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el tiempo
		System.out.print("Introduzca la hora: "); // pedimos al usuario
		hour = sc.nextInt(); // pedimos de teclado (default input).
		System.out.print("Introduzca los minutos: "); // pedimos al usuario
		min = sc.nextInt(); // pedimos de teclado (default input).
		System.out.print("Introduzca los segundos: "); // pedimos al usuario
		sec = sc.nextInt(); // pedimos de teclado (default input).
		System.out.print("¿Cuanto desea incrementar? "); // preguntamos al usuario
		secIncrement = sc.nextInt(); // pedimos de teclado (default input).

		// Hacemos la suma de segundos y modificamos la hora actual
		if (sec + secIncrement == 60 || sec + secIncrement > 60) {
			tester = sec+secIncrement / 60;
			System.out.println(tester);
			min += tester;
		}
		tester = 0; //We restart this variable to his default value
		if(min >= 60) {
			tester = min / 60;
			System.out.println(tester);
			hour += tester;
		}
		
		// Mostramos la nueva hora
		System.out.println("Esta sería la nueva hora " + hour + ":" + min + ":" + sec);

		// Cerramos el Scanner
		sc.close();

	}
}

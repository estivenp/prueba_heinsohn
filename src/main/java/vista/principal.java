package vista;
import java.util.ArrayList;
import logica.Ejercicios;

/**
 *
 * @author jonathan ibarra
 */
public class principal {
    public static void main(String[] args) {
        //ejercicio 1
          System.out.print("------- Ejercicio 1 -------");
          Ejercicios ejercicios = new Ejercicios();
          ArrayList<Integer> enteros = new ArrayList<Integer>();
          System.out.println("Array inicial: "+enteros);
          enteros.add(1);
          enteros.add(0);
          enteros.add(1);
          enteros.add(0);
          enteros.add(0);
          enteros.add(0);
          enteros.add(1);
          enteros.add(1);
          int permutaciones=2;
          enteros=ejercicios.ejercicio1(enteros, permutaciones);
          System.out.println("Permutaciones: "+permutaciones);
          System.out.println("Array final: "+enteros);
          
          //ejercicio 2
          System.out.println("\n\n------- Ejercicio 2 -------");
          int a=4,b=7,c=5;
          System.out.println("Los numeros son: "+a+", "+b+", "+c);
          ejercicios.ejercicio2(a,b,c);
          
          //ejercicio 3
          System.out.println("\n\n------- Ejercicio 3 -------");
          int vector[] = {15,7,2,1,5,9,8,7,24,50};
          System.out.print("\nvector inicial: ");
          for(int i=0; i<vector.length;i++){
              System.out.print(vector[i]+", ");
          }
          ejercicios.ejercicio3(vector);
          
           //ejercicio 4
          System.out.println("\n\n------- Ejercicio 4 -------");
          String cadena="heinsohn";
          System.out.println("Palaba: "+ cadena);
          ejercicios.ejercicio4(cadena);
    }


}


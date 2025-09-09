/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riverasegura_20250908;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //tamaño del arreglo
        int cantidad_elementos = 5;
        
        //creacion einstancia arreglo num desordenados
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //creacion e instancia de num ordenadas
        int[] numeros_ordenados = new int[cantidad_elementos];
        
        //creacion e instancia del objeto scanner
        Scanner scanner = new Scanner(System.in);
    
        //notificación al usuario para indicarle que debe ingresar valores enteros
        System.out.println("Por favor ingrese " + cantidad_elementos + " numeros enteros de manera desordenada");
        
        //se recorre el arreglo de numeros enteros desordenados que por defecto
        //tienen el valor de cero
        for(int i = 0; i<numeros_desordenados.length; i++){
            
            //se solicita al usuario el ingreso de un valor
            System.out.print("Digite el elemento " + (i+1)+ ": ");
            
            //se digita el valor desde el teclado de tipo entero
            numeros_desordenados[i] = scanner.nextInt();
        
        }
        
        //se imprime una salida al usuario para mostrar lo que ha digitado
        System.out.println("Usted digito los siguientes numeros:");
        
        //se recorre el arreglo de valores digitados
        for(int j = 0; j < numeros_desordenados.length; j++){
            
            //se imprimen los numeros digitados por el usuario
            //almacenados en el arreglo de numeros desordenados
            System.out.print(numeros_desordenados[j] + " " );
       
        }
        
        //hacemos salto de linea
        System.out.println();
        
        //invocamos la funcion para ordenar el arreglo
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //imprimimos la salida al usuario
        System.out.println("Los numeros ordenados son: " );
        
        //se recorre el arreglo para obtener cada valor
        //del arreglo ordenado
        for(int k=0;k<numeros_ordenados.length; k++){
            
            //se imprime el valor de cada elemento
            System.out.print(numeros_ordenados[k]+ " ");
        
        }
    
        System.out.println(" ");
    
    }
    
    //funcion para ordenar un arreglo unidimensional
    public static int[] ordenar(int[] arreglo){
        
        //se recorre el arreglo para evaluar cada posicion
        for(int i = 0; i < arreglo.length; i++){
            
            //se hace un segundo recorrido para poder comparar
            //la posicion actual con la posicion siguiente
            for(int j = 0; j < arreglo.length - 1; j++){
                
                //se evalua el valor de cada elemento
                //en el arreglo
                if(arreglo[j]>arreglo[j+1]){
                        
                    //si es mayor, se crea una variable para almacenar el valor
                    //del elemento mayor
                    int mayor = arreglo[j];
                    
                    //se cambia la posicion del elemento actual
                    arreglo[j] = arreglo[j+1];
                    
                    //se intercambia la posicion del siguiente elemento
                    //asignando el valor mayor 
                    arreglo[j+1] = mayor;
                    
                }
                
            }
          
        }        
        return arreglo;
    }
    
}

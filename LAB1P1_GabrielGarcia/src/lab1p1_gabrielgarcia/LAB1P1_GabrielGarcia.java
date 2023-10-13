package lab1p1_gabrielgarcia;

import java.util.Scanner;


public class LAB1P1_GabrielGarcia {

   
     public static void main(String[] args) {
  
         Scanner scanner=new Scanner(System.in);
        int numero=2;
        char character='a';
        double doble=1.25;
        boolean VoF=true;
         System.out.println("INgrese un numero: ");
        numero = scanner.nextInt();
        
        if(numero == 1){
               int num1=15;
               int num2=30;
               int resultado;
               resultado = 15*30;
               System.out.print("Resultado: ");
               System.out.println(resultado);
                       
               
        }else if(numero == 2){
            System.out.println("Ingrese su numero entero: ");
            int numeroUsuario = scanner.nextInt();
            System.out.println("Ingrese su numero entero: ");
            int numeroUsuario2 = scanner.nextInt();
            System.out.println("Ingrese su numero entero: ");
            int numeroUsuario3 = scanner.nextInt();
            
            double promedio = (numeroUsuario+numeroUsuario2+numeroUsuario3)/3;
            
            System.out.println("Promedio: "+ promedio);
                 
    
        }else{
            System.out.println("Salio del programa");
            
        }
       }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_diegocruz;
import java.util.Scanner;
/**
 *
 * @author dfcm9
 */
public class Lab3P1_DiegoCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner (System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("Menu");
            System.out.println(" 1. Serie Euclediana ");
            System.out.println(" 2. Pokebola");
            System.out.println(" 3. Ok Boomer!");
            System.out.println(" 4. Salir");
            System.out.println("Ingrese una opcion");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                {
                    System.out.println("Puntos a ingresar");
                    int puntos = sc.nextInt();
                    double acumulador = 0;
                    for (int i=1; i<=puntos; i++){
                        System.out.println("Ingrese X:");
                        int x = sc.nextInt();
                        System.out.println("Ingrese Y:");
                        int y = sc.nextInt();
                        double res = x-y;
                        double respot = Math.pow(res, 2);
                        acumulador = acumulador + respot;
                        
                    }
                    acumulador = Math.sqrt(acumulador);
                    System.out.println("La distancia euclidiana es: "+acumulador);
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese el tamanio");
                    int size = sc.nextInt();
                        while (size<=0){
                            System.out.println("Ingrese un numero positivo");
                            size = sc.nextInt();
                            
                        }
                        for (int i =1; i<=size; i++){
                            for (int j=1; j<=(size*2)-1 ; j++){
                                if (i <= (size/2)-1 || i == 1 || i == size || j == 1 || j == (size*2-1)){
                                System.out.print("*");
                                }
                                else if(i == size/2){
                                    if (j <= (size/2)+1 || j > (size/2 +1)+ (size/2+2) ){
                                        System.out.print("*");
                                    }
                                    else if (j > (size/2)+1){
                                        System.out.print("#");
                                    
                                    }
                                
                                }
                                else if (i == size/2+1){
                                    if (j <= (size/2)+1 || j > (size/2 +1)+ (size/2+2)){
                                        System.out.print("#");
                                    }
                                    else{
                                        System.out.print(" ");
                                    }
                                }
                                else if (i == size/2+2){
                                    if (j <= (size/2)+1 || j > (size/2 +1)+ (size/2+2)){
                                        System.out.print(" ");
                                    }
                                    else{
                                        System.out.print("#");
                                    }
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("");
                        }
                    break;
                }
                case 3:
                {
                    System.out.println("Ingrese su ano de nacimiento");
                    int agno = sc.nextInt();
                    while (agno<=0){
                        System.out.println("Ingrese un numero positivo");
                        agno = sc.nextInt();
                    }
                    if (agno >= 2013 && agno<=2025)
                        System.out.println("Felicidades usted es de la Gen Alpha!");
                    else if (agno >=1990  && agno<= 2012)
                        System.out.println("Felicidades usted es de la Gen Z!");
                    else if (agno >=1980  && agno<= 1994)
                        System.out.println("Felicidades usted es de la generacion Millenials!");
                    else if (agno >=1975  && agno<= 1985)
                        System.out.println("Felicidades usted es de la generacion Xennials!");
                    else if (agno >=1960  && agno<= 1979)
                        System.out.println("Felicidades usted es de la Generation X!");
                    else if (agno > 1946)
                        System.out.println("Felicidades usted es de la Baby Boomer Gen!");
                    else{
                        System.out.println("Edad sin generacion.");
                    }
                    break;
                }
                case 4:
                {
                    seguir = false;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
}
    
}
        
            
}


package lab.pkg4_angeltorres_jonrryenamorado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Lab4_AngelTorres_JonrryEnamorado {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Jugadores> jugadores = new ArrayList();
        int menu=-1;
        
        try{//Try-Catch menú principal
            do{
                System.out.println("A.M.A \n"
                        + "1 - Administrar Jugadores\n"
                        + "2 - Nueva Partida\n"
                        + "0 - Salir\n");
                menu=sc.nextInt();
                
                switch(menu){
                    case 1:
                        int menuJ=-1;
                        
                        try{
                            System.out.println("Administrar Jugadores\n"
                                    + "1 - Agregar\n"
                                    + "2 - Listar\n"
                                    + "3 - Eliminar\n");
                            menuJ=sc.nextInt();
                            
                            switch(menuJ){
                                case 1:
                                    String nombre, id, sex,birth;
                                    int edad; 
                                    
                                    
                                    System.out.println("Nombre: ");
                                    nombre=sc.next();
                                    
                                    System.out.println("ID: ");
                                    id=sc.next();
                                    
                                    System.out.println("Edad: ");
                                    edad=sc.nextInt();
                                    
                                    System.out.println("Sexo: ");
                                    sex=sc.next();
                                    
                                    System.out.println("Lugar de Nacimiento: ");
                                    birth=sc.next();
                                    
                                    jugadores.add(new Jugadores(nombre, id, birth, edad, sex));
                                    
                                    break;
                                case 2:
                                        
                                    break;
                                case 3:
                                    break;
                                    
                            }
                            
                        }catch(Exception e){
                            
                        }
                            
                        break;
                    case 2:
                        System.out.println("Lista de Jugadores\n");
                        break;
                    case 3:
                        System.out.println("Eliminar Jugadores\n");
                        break;
                }
            }while(menu!=0);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }//Final Try-Catch menú principal
        
    }
    
}

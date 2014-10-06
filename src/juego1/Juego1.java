
package juego1;

import java.util.Scanner;

public class Juego1 {

    public static void main(String[] args) {

        System.out.println("Introduzca su nombre:");
        
        String nombre;
        
        Scanner nombre_in = new Scanner (System.in);
        
        nombre = nombre_in.nextLine();
                
        System.out.println("Bienvenido " + nombre);
        
        int pregunta;
        
        System.out.println("Introduzca el numero de la pregunta: (1-5)");
        
        Scanner numpregunta = new Scanner (System.in);
        
        int numero; 
                
        numero = numpregunta.nextInt();
        
        System.out.println("Ha escogido la pregunta numero " +numero);
        
        String enunciado = "";
        int respuesta = 0; 
       
        switch(numero){
        
            case 1: 
                
                enunciado = "¿De que color es un camión de  bomberos?  1= Rojo  2= Azul 3= Amarillo";
                respuesta = 1;
                
                break;
                
            case 2:
                
                enunciado = "¿Quien es el presidentre de España? 1= Marianito el Tuerto  2= Un capullo  3= Un plasma ";
                respuesta = 3;
                
                break;
   
                case 3:
                    
                enunciado = "¿Cuantas ruedas tiene un coche? 1= Dos  2= Cinco  3= Cuatro";
                respuesta = 3;
                
                break;
        
                    case 4:
                
                        enunciado = "¿Donde nació Chiquito de la calzada? 1= Cromenagüer 2= Jaaarl 3= No puedo!";
                        respuesta = 3;
                        
                        
                break;
        
                        case 5:
                
                            enunciado   = "¿Cuantos años tiene la tierra? 1= Tres  2= Unos milloncejos  3= Mas de mil";
                            respuesta = 2;
                            
                break;
                            
                        default:
                            
                            System.out.println("No existe la pregunta.");
        
        }
        
        System.out.println(enunciado);
        
        Scanner resp_user = new Scanner (System.in);
        
        int respuestaUsuario; 
                
                respuestaUsuario = resp_user.nextInt();
                
                
        if (respuesta == respuestaUsuario){
        
            System.out.println("Respuesta CORRECTA!!!!!! Enhorabuena " +nombre);
        
        }else{
        
            System.out.println("Respuesta incorrecta... :(  Lo siento " +nombre);
        
        }
        
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;
import java.util.*;
/**
 *
 * @author JorgeRicardo
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double grado,faren;/*una variable es para los grados celcius y la otra para
                         almacenar el resultado de convertirlos a fharenheit*/
    grado=pedirGrado();
    faren=conver(grado);//aqui se hace la conversion
    mostrarFaren(grado,faren);
    }
    
    public static double pedirGrado(){//en este metodo pido los grados celcius
    double grado;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Escribe los grados C° que quieras convertir: ");
    grado=teclado.nextDouble();
    return grado;
    }
    public static double conver(double grado){/*aqui hago la conversion a 
                                                 fharenheit*/
    double f;
    f=(grado*1.8)+32; 
    return f;
    }
    public static void mostrarFaren(double grado,double faren){/*mostrar
                                                                resultados*/
    System.out.println(grado+"C° son: "+faren+"F°");
    }
    
    
}

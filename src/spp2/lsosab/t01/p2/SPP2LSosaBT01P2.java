//Luisa Fernanda Sosa Brambila
// A01411485
// IIS
package spp2.lsosab.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBT01P2 {

    public static void main(String[] args) {
        System.out.println("Calculadora de superficie y perímetro de un rectángulo");
        Scanner teclado= new Scanner(System.in);
        double base, altu, sup, per;
        
        System.out.println("Ingresa el valor de la base:");
        base= teclado.nextDouble();
        System.out.println("Ingresa el valor de la altura:");
        altu= teclado.nextDouble();
        
        sup= base*altu;
        per= 2*base + 2*altu;
        
        System.out.println("La superfcie del rectángulo es: "+ sup);
        System.out.println("El perímetro del rectángulo es: "+ per);
        
    }
    
}

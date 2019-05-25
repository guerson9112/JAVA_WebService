/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebservices;

import java.util.Scanner;

/**
 *
 * @author guerson.maldonado
 */
public class ClienteWebServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a ;
        System.out.println("INGRESE UN PRIMER VALOR");
        a=leer.nextDouble();
        double b ;
        System.out.println("INGRESE UN SEGUNDO VALOR");
        b=leer.nextDouble();
        System.out.println("EL RESULTADO ES: "+triangulo(a,b));
    }

    private static Double triangulo(double lado1, double lado2) {
        uddi.Figuras_Service service = new uddi.Figuras_Service();
        uddi.Figuras port = service.getFigurasPort();
        return port.triangulo(lado1, lado2);
    }
    
    
    
}

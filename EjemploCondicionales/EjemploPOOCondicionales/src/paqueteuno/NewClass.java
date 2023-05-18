/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

/**
 *
 * @author omerb
 */
public class NewClass {
    public static void main(String[] args) {
        Hospital n1 = new Hospital("Isidro Ayora",200,31);
        System.out.printf("%s\n",n1.obtenerCiudadHospital());
        n1.establecerCiudadHospital("Loja");
        //System.out.printf("%s\n",n1.obtenerCiudadHospital());
        System.out.printf("%s\n",n1);
    }
}

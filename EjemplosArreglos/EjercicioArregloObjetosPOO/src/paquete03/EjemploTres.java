/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class EjemploTres {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Profesor pro1 = new Profesor("Luis A", "Nombramiento");
        Profesor pro2 = new Profesor("Ana E", "Contrato");
        /* Calificacion[] calificaciones = {new Calificacion(10, "Computación", pro1),
            new Calificacion(9, "Electrónica", pro2)};*/
        Calificacion[] calificaciones = {new Calificacion(10, "Computación"),
            new Calificacion(9, "Electrónica")};
        calificaciones[0].establecerProfesor(pro1);
        calificaciones[1].establecerProfesor(pro2);

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f con profesor: %s\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), objetoCalificacion.obtenerProfesor().obtenerNombre());
        }

    }
}

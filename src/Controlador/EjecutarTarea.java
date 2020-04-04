/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ClaseCA;
import Clases.ClaseCB;
import Clases.ClaseCD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class EjecutarTarea {

    private static ArrayList ClaseCA = new ArrayList<>();

    public static void main(String[] args) {
        ClaseCA a = new ClaseCB(1, 2, 3);
        ClaseCD d = new ClaseCD(1, 2);
        ClaseCA ca = new ClaseCA(1, 3);
        System.out.println("La suma es " + a.sumar());
        System.out.println("La suma es " + d.suma());
        System.out.println("La suma es " + ca.sumar());
        System.out.println("La multiplicacion es " + ca.multi());

        System.out.println("El valor mayor es " + ca.mayor());

        ArrayList<ClaseCA> Clase1 = new ArrayList<ClaseCA>();
        Clase1.add(new ClaseCA(8, 5));
        Clase1.add(new ClaseCA(7, 5));
        Clase1.add(new ClaseCA(2, 4));
        Clase1.add(new ClaseCA(45, 78));

        Collections.sort(Clase1);

        for (ClaseCA auxiliar : Clase1) {
            System.out.println("Los elementos oredenados de mayor a menor X " + auxiliar.x + " Numeros Y " + auxiliar.y);
        }

    }

}

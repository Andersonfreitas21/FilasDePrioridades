/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Programador-03
 */
public class FilaInterface {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(4);
        
        System.out.println(fila.toString());
        fila.remove();
        System.out.println(fila.toString());
        fila.remove();
        System.out.println(fila.toString());
        fila.remove();
        System.out.println(fila.toString());
        fila.remove();
        System.out.println(fila.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciojava;

/**
 *
 * @author Felipe Amaral
 */
public class ExercicioJava {

    public static void main(String[] args) {
        
        conta p1 = new conta();
        p1.dono = "João";
        p1.setnumConta (1111);
        p1.abrirConta("cc");
       
        conta p2 = new conta();
        p2.dono = "Maria";
        p2.setnumConta (2222);
        p2.abrirConta("cp");
       
        p1.sacar(200);
        p2.depositar(100);
        
        p1.EstadoConta();
        p2.EstadoConta();


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciojava;

/**
 *
 * @author Felipe Amaral
 */
public final class conta {

    public int numConta;
    protected String tipo;
    public String dono;
    private float saldo;
    public boolean status;
    
    public void EstadoConta(){
    
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Número da conta: " + this.getnumConta());
        System.out.println("Saldo da conta: " + this.getsaldo());
        System.out.println("status: " + this.getstatus());
    }

    public void status() {

        if (status == true) {
            System.out.println("Sua conta é:");
            System.out.println(this.numConta);
        } else {
            System.out.println("Abra uma conta");
        }

    }

    public boolean getstatus() {

        return this.status;
    }

    public void setstatus(boolean st) {

        this.status = st;

    }

    public int getnumConta() {

        return this.numConta;
    }

    public void setnumConta(int nc) {

        this.numConta = nc;
    }

    public String gettipo() {

        return this.tipo;
    }

    public void settipo(String tp) {

        this.tipo = tp;

    }

    public float getsaldo() {

        return this.saldo;
    }

    public void setsaldo(float s) {

        this.saldo = s;

    }

    public void abrirConta(String t) {

        settipo(t);
        setstatus(true);

        if (t == "cc") {
            this.setsaldo(50);
            
        } else if (t == "cp") {

            this.setsaldo(150);
        }
    }

    public void depositar(float dp) {

        if (this.getstatus()) {
            this.setsaldo(this.getsaldo() + dp);
            System.out.println("Deposito realizado com sucesso");
        } else {

            System.out.println("Abra sua conta");
        }
    }

    public void sacar(float sa) {

        if (this.getstatus()) {

            if (this.getsaldo() < sa) {

                this.setsaldo(this.getsaldo() - sa);
                System.out.println("Saque realizado com sucesso na ocnta de" + this.dono);
            } else {

                System.out.println("Seu saldo é  atual é insuficiênte para fazer esse saque:");

            }

        } else {
            
            System.out.println("Impossivel sacar como uma conta fechada");
        }
    }

    
}

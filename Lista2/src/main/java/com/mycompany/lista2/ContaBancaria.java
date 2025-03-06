/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

/**
 *
 * @author tamir
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;


public void setNumero(String numero){
        if(numero.trim().isEmpty()){
           throw new IllegalArgumentException("O numero da conta é inválido: ");
        }
        this.numero=numero; 
    }
    public String getNumero(){
        return this.numero;
    }
    public void setTutular(String titular){
        if(titular.trim().isEmpty()){
           throw new IllegalArgumentException("O titular da conta é inválido: ");
        }
         this.titular=titular; 
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor de deposito está valido");
        }
        saldo+=valor;
    }
    public void sacar(double valor){
        if (valor<0 || valor>saldo){
                throw new IllegalArgumentException("O valor de saque está invalido ou o saldo está suficiente");
        }
        saldo -=valor;
    }
    public void transferir (ContaBancaria destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }

    void setTitular(String agostinho_carrara) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

/**
 *
 * @author tamir
 */
public class App {
    public static void main(String[] args) {
        ContaBancaria c1, c2;
        c1 = new ContaBancaria();
        c1.setNumero("225-3");
        c1.setTitular("agostinho carrara");
        
        c2 = new ContaBancaria();
        c2.setNumero("227-3");
        c2.setTitular("Tamires");
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(500);
        c2.depositar(3000);
        
        c1.transferir(c1, 1800);
        System.out.println("Conta 1 Titular"+ c1.getTitular() + "saldo" + c1.getSaldo());
}
}
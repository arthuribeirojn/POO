/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01;



public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta :" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        
}
    
    void rabiscar() {
        if(this.tampada == true){
            System.out.println("erro! Não posso rabiscatr");
        }else{
            System.out.println("Estou Rabiscanso");
        }
    }
    void tampar() {
        this.tampada = true;
        
    }
    void destampar() {
        this.tampada = false;
        
        
    }
    
}
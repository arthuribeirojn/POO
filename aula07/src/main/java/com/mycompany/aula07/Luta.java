package com.mycompany.aula07;

import java.util.Random;

public class Luta  {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l2.getCategoria().equals(l1.getCategoria()) && l1 != l2){
        this.aprovado = true;
        this.desafiado = l1;
        this.desafiante = l2;
    }else{
            this.aprovado =  false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void Lutar(){
        if(this.isAprovado()){
            System.out.println("###DESAFIADO###");
           this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt( 3);
            System.out.println("===== Resulatado da luta =====");
           switch(vencedor){
            case 0:
            System.out.println("### Empatou ### ");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            break;
            case 1:
            System.out.println("### Ganhou ### " + desafiado.getNome());
            this.desafiado.ganhaLuta();
            this.desafiante.perderLuta();
            break;
            case 2:
            System.out.println("### Ganhou ### " + desafiante.getNome());
            this.desafiado.perderLuta();
            this.desafiante.ganhaLuta();
            break;
        }
            System.out.println("======================");
           
        }else {
            System.out.println("Luta não pode acontecer");
        
    }
            
        }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}

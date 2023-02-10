package com.mycompany.aula07;

public class Luta  {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l[1], l2){
        if(l1.getCategoria()== l2.getCategoria() && l1 <> l2){
        aprovado = verdadeiro;
        desafiado = l1;
        desafiante = l2;
    }else{
            aprovado =  false;
            desafiado = null;
            desafiante = null
        }
        
    }
    public void Lutar(){
        if(isAprovada()){
           desafiado.apresentar();
           desafiante.apresentar();
           vencedor = aleatório(0..2)
           choice(vencedor){
            case 0;
            System.out.println("Empatou");
            desafiado.empatarLuta();
            dessafiante.empatarLuta();
            case 1;
            System.out.println("Ganhou" + desafiado.getNome());
            desafiado.ganharLuta();
            desafiante.perderLuta();
            case 2;
            System.out.println("Ganhou" + desafiante.getNome());
            desafiado.perderLuta();
            desafiante.ganhorLuta();
           
        }
           
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

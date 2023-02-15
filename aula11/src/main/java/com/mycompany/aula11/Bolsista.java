package com.mycompany.aula11;

public class Bolsista extends Aluno {
    private int bolsa;
    public void renovarMatricula(){
        System.out.println("Bolsa renovada " + this.getNome());
        
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista!");
        
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}

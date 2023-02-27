package com.mycompany.aula14;

public class  Gafanhoto extends Pessoa {
    private String login;
    private int totAsssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAsssistido = 0;
    }

   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAsssistido() {
        return totAsssistido;
    }

    public void setTotAsssistido(int totAsssistido) {
        this.totAsssistido = totAsssistido;
    }
    
   /* public void viuMaisUm(){
        if (viuMaisUm) {
            setTotAssistido(totAssistido + 1);
        } else {
        }
    }

    @Override
    public void ganharExp() {
        if(totAssistido > totAssistido){
            isExperiencia(+1);
        }
    }*/

    @Override
    public String toString() {
        return "Gafanhoto{" + toString() + "login=" + login + ", totAsssistido=" + totAsssistido + '}';
    }
    
    
    
}

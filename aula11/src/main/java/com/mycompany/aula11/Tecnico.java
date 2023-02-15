package com.mycompany.aula11;

public class Tecnico extends Pessoa {
    private String registroProfissinal;
    public void praticar(){
        System.out.println("Está praticando");
    }

    public String getRegistroProfissinal() {
        return registroProfissinal;
    }

    public void setRegistroProfissinal(String registroProfissinal) {
        this.registroProfissinal = registroProfissinal;
    }
    
}


package com.mycompany.aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();
        
        v1.setNome("Juvenal");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        a1.setNome("Pedro");
        a1.setIdade(20);
        a1.setSexo("M");       
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        b1.setNome("Maria");
        b1.setIdade(19);
        b1.setSexo("F");
        b1.setMatricula(1112);
        System.out.println(b1.toString());
        b1.renovarMatricula();
        b1.pagarMensalidade();
        
        t1.setNome("Marta");
        t1.setIdade(30);
        t1.setSexo("F");
        System.out.println(t1.toString());
        
        p1.setNome("Carlos");
        p1.setIdade(40);
        p1.setSexo("M");
        System.out.println(p1.toString());
        p1.receberSalario();
        System.out.println(p1.getSalario());
    }
}

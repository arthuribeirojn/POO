package com.mycompany.aula10;

public class Aula10 {

    public static void main(String[] args) {
       
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();
      
      p1.setNome("Pedro");
      p2.setNome("Maria");
      p3.setNome("Carlos");
      p4.setNome("Joao");
      p1.setSexo("M");
      p2.setSexo("F");
      p3.setSexo("M");
      p4.setSexo("M");
      p1.setIdade(20);
      p2.setIdade(30);
      p3.setIdade(60);
      p4.setIdade(50);
      p2.setCurso("Informática");
      p3.setSalario(2500.75f);
      p4.setSetor("Estoque"); 
      
      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());
      
    }
}

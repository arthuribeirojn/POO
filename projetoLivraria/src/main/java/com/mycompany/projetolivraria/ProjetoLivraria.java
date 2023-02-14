package com.mycompany.projetolivraria;

public class ProjetoLivraria {

    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l =  new Livro[3];
       
       p[0] = new Pessoa("Joana", 15, "F");
       p[1] = new Pessoa("Nicolas", 9, "m");
       
       l[0] = new Livro("Aprendendo POO", "Alberto Neto", 500,  p[0]);
       l[1] = new Livro("Conceitos de JAVA", "Catarina", 800, p[1]);
               
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
       
    }
}


package com.mycompany.aula07;

public class Lutador {
 private String nome;
 private String nacionalidade;
 private int idade;
 private float altura;
 private float peso;
 private String categoria;
 private int vitorias;
 private int derrotas;
 private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }


    public String getNome() {
        return nome;
    }

    public void setName(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String ca) {
        this.categoria = ca;
        if(peso<52.2){
            this.setCategoria("Invalido");
        }else if(peso<= 70.3){
            this.setCategoria("Leve");
        }else if(peso<= 83.9){
            this.setCategoria("Médio");
        }else if(peso<= 120.2){
            this.setCategoria("Pesado");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
 
 public void apresentar(){
     System.out.println("Lutador: " + getNome());
     System.out.println("Origem: " + getNacionalidade());
     System.out.println(getIdade() + " anos");
     System.out.println(getAltura() + " m de altura ");
     System.out.println("Pesando:" + getPeso());
     System.out.println("Ganhou: " + getVitorias());
     System.out.println("Perdeu: " + getDerrotas());
     System.out.println("Empatou: " + getEmpates());
 }
 public void status(){
     System.out.println("Lutador: " + getNome());
     System.out.println("Pesando:" + getPeso());
     System.out.println("Ganhou: " + getVitorias());
     System.out.println("Perdeu: " + getDerrotas());
     System.out.println("Empatou: " + getEmpates());
     
 }
 public void ganhaLuta(){
    this.setVitorias(getVitorias() + 1);
     }     
 
 public void perderLuta() {
      this.setDerrotas(getDerrotas() + 1); 
     
 } 
 public void empatarLuta(){
     this.setDerrotas(getDerrotas() + 1);
     
 }


}

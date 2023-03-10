package com.mycompany.aula07;

public final class Lutador {
 private String nome, nacionalidade, categoria;
 private int idade, vitorias, derrotas, empates;
 private float altura, peso;
   

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

    private void setCategoria() {
        
        if(this.peso<52.2){
            this.categoria ="Inválido";
        }else if(this.peso<= 70.3){
            this.categoria = "Leve";
        }else if(this.peso<= 83.9){
            this.categoria = "Médio";
        }else if(this.peso<= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
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
     System.out.println("--------------------------------");
     System.out.println("Apresentamos o lutador: " + getNome());
     System.out.println("Diretamente: " + getNacionalidade());
     System.out.println(getIdade() + " anos de idade");
     System.out.println(getAltura() + " m de altura ");
     System.out.println("Pesando:" + getPeso() + " kg");
     System.out.println("Ganhou: " + getVitorias() + " vezes");
     System.out.println("Perdeu: " + getDerrotas() + " vezes");
     System.out.println("Empatou: " + getEmpates() + " vezes");
    
 }
 public void status(){
     System.out.println("----------------");
     System.out.println("Lutador: " + getNome()+ " é um peso " +this.getCategoria());
     System.out.println("Pesando: " + getPeso()+ " kg");
     System.out.println("Ganhou: " + getVitorias() + " vezes");
     System.out.println("Perdeu: " + getDerrotas() + " vezes");
     System.out.println("Empatou: " + getEmpates() + " vezes");
     System.out.println("");
 }
 public void ganhaLuta(){
    this.setVitorias(this.getVitorias() + 1);
     }     
 
 public void perderLuta() {
      this.setDerrotas(this.getDerrotas() + 1); 
     
 } 
 public void empatarLuta(){
     this.setDerrotas(this.getDerrotas() + 1);
     
 }

}

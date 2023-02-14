package com.mycompany.projetolivraria;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
    return "Livro{" + "\n titulo=" + titulo + ",\n autor=" + autor + ",\n totPaginas=" + totPaginas + ",\n aberto=" + aberto + ",\n Nome= " + leitor.getNome() + " Idade= " + leitor.getIdade()+ " Sexo=  " + leitor.getSexo()+ "}";
    }
    


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas; 
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas(int p) {
        return totPaginas;
    }

    public void setTotPaginas(int p) {
        this.totPaginas = p;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    @Override
    public void abrir() {
        this.setAberto(true);        
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p> this.totPaginas){
            this.pagAtual = 0;
        }else{
        this.pagAtual = p;
        }
    }
        

    @Override
    public void avancarPagina(int p) {
        if(pagAtual > totPaginas){
            pagAtual = 0;
        }
        p = pagAtual++; 
        
    }

    @Override
    public void voltarPagina(int p) {
        if(pagAtual == 0){
            System.out.println("Esta no inicio.");            
        }
        p = pagAtual--;
        
    }
    
}

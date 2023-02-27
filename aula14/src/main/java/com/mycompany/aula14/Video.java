package com.mycompany.aula14;

public class Video implements AcoesVideo {
    protected String titulo;
    protected int avaliacao;
    protected int views;
    protected int curtidas;
    protected boolean reproduzir;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzir = false; 
    }
    
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzir() {
        return reproduzir;
    }
    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
    @Override
    public void play() {
    }
    @Override
    public void pause() {
    }
    @Override
    public void like() {
    } 

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzir=" + reproduzir + '}';
    }
    
    
}

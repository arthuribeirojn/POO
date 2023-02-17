package com.mycompany.aula12;

public class Aula12 {
    public static void main(String[] args) {        
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        Reptil r = new Reptil();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();        
        
        Peixe p = new Peixe();
        GoldFish g = new GoldFish();
        
        Ave a = new Ave();
        Arara ar = new Arara();      
                
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println(m.toString());
        
        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println(c.toString());
        
        k.setPeso(3.3f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        System.out.println(k.toString());
        
        co.setPeso(0.35f);
        co.setIdade(1);
        co.setMembros(0);
        co.locomover();
        co.alimentar();
        co.emitirSom();        
        System.out.println(co.toString());
        
        t.setPeso(25f);
        t.setIdade(50);
        t.setMembros(4);
        t.locomover();
        t.alimentar();
        t.emitirSom();        
        System.out.println(t.toString());
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolhas();
        System.out.println(p.toString());
        
        g.setPeso(0.40f);
        g.setIdade(2);
        g.setMembros(0);
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolhas();
        System.out.println(g.toString());
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println(a.toString());
        
    }
}

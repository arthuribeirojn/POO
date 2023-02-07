
package com.mycompany.aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("_________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);                 
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.isStatus() == true){
          this.setSaldo(this.getSaldo() + v); 
          System.out.println("Depositado");
        }else{
            System.out.print("Impossivel depósitar");
        }
    }
    public void sacar(float v){
        if (this.isStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Sacado");
            }else{
                System.out.print("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar, conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
           v = 20;
        }
        
        if(this.isStatus()){
            setSaldo(v + this.getSaldo());
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    
}

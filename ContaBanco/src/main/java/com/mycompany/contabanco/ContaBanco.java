
public class ContaBanco {

    
        public float numConta;
        private String tipo;
        private String dono;
        private float saldo;
        private boolean status;
        public void abrirConta(String t){
           
        }
        public void fecharConta(){
        }
        public void sacar(){
        }
        public void pagarMansal(){
        }

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public float getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(float n) {
        this.numConta = n;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
                
    
}

package aula12;
 public class Reptil extends Animal{
     
     public String corEscama;
     
     @Override
     public void locomover(){
         System.out.println("Rastejando");
     }
     
     @Override
     public void emitirSom(){
         System.out.println("Som de reptil");
     }
     @Override
     public void alimentar(){
         System.out.println("Comendo carne");
     }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
     
     
     
    
}

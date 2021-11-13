package aula12;
 public class Mamifero extends Animal {
    
     public String corPelo;

     @Override
     public void locomover(){
         System.out.println("Andando");
     }
     
     @Override
     public void alimentar(){
         System.out.println("Comendo");
         
     }
     
     @Override
     public void emitirSom(){
         System.out.println("Som de mamifero");
         
     }
     
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
     
     
     
}

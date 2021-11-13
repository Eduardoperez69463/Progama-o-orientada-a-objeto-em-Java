package aula12;
 public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Ninho feito");
        
    }
    
@Override
     public void locomover(){
         System.out.println("Voando");
     }
     
     @Override
     public void emitirSom(){
         System.out.println("Cantarolando");
     }
     @Override
     public void alimentar(){
         System.out.println("Comendo insetos");
     }
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
    
    
}



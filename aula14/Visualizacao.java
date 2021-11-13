package aula14;
public class Visualizacao {
     private Espectador espectador;
     private Video filme;

    public Visualizacao(Espectador espectador, Video filme) {
        this.espectador = espectador;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme = filme;
        this.filme.setViews(this.filme.getViews()+1);
        this.filme.setReproduzindo(true);
    }
     
     
     public void avaliar(){
         this.filme.setAvaliacao(5);
      
     }
     
  public void avaliar(int nota){
      this.filme.setAvaliacao(nota);
         
     }
  public void avaliar(float porc){
      int tot;
      if(porc <= 20){
        tot = 3;
      }
      else if(porc <= 50){
           tot = 5;
       }
      else if (porc <=90){
          tot = 8;
      }
      else{
          tot = 10;
      }
          this.filme.setAvaliacao(tot);
      
  }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return 
                "Visualizacao{"+ "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}

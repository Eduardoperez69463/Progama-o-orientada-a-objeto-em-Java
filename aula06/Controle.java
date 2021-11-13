package aula06;
 public class Controle implements Controlador {
     
     private int volume;
     private boolean ligado;
     private boolean tocando;
     
     public  Controle(){
         this.setVolume(50);
         this.setLigado(false);
         this.setTocando(false);
     }
      @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?"+this.getLigado());
        System.out.println("Tem volume?"+this.getTocando());
        System.out.print("Volume:"+this.getVolume());
           for (int i = 0; i <=this.getVolume();i+=10){
               System.out.print("|");
           }
    }

    @Override
    public void desligarMenu() {
        System.out.println("Desligando menu");
        
    }
      @Override
    public void maisVolume() {
        if (this.getLigado() == true && this.getVolume() <= 90){
            this.setVolume(this.getVolume()+10);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() ==true && this.getVolume() >= 10){
            this.setVolume(getVolume()-10);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() ==true){
            this.setLigado(false);
        }
    }

     public int getVolume(){
         return this.volume;
     }
     public void setVolume(int v){
         this.volume= v;
     }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        this.ligado = l;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean t){
        this.tocando = t;
    }

  
}

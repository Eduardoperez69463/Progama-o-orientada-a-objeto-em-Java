package aula07;

import java.util.Random;



public class Luta {
    
      private Lutador desafiante,desafiado;
      private  int rounds;
      private boolean aprovada;
      
    public Luta(){
           
           
           

       }
    public void marcarLuta(Lutador l1,Lutador l2){
         if((l1.getCategoria()==l2.getCategoria())&&(l1.getNome()!=l2.getNome())&&
                 ( l1.getCategoria() !="peso Invalido")&&(l2.getCategoria() !="peso Invalido")){
                        System.out.println("Luta aprovada!");
                        this.setDesafiante(l1);
                        this.setDesafiado(l2);
                        this.setAprovada(true);
                    }
         
         else{
                System.out.println("Luta não aprovada!");
                this.setAprovada(false);
                this.setDesafiante(null);
                this.setDesafiado(null);
             
             
             
         }

       }
    public void lutar(){
                  if(this.getAprovada()){
                      System.out.println("############### LUTA ##############");
                      System.out.println("###########DESAFIANTE#############");
                      this.getDesafiante().apresentar();
                       System.out.println("###########DESAFIADO#############");
                       this.getDesafiado().apresentar();
                        
                         System.out.println("___________________________________________");
                      while((this.getDesafiado().getHp() >= 0) && (this.getDesafiante().getHp()>= 0)){
                               
                           this.getDesafiante().setHpa(this.getDesafiante().getHp()-this.getDesafiado().getDano());
                           System.out.println("Soco de  "+this.getDesafiante().getNome()+"  agora a vida é:"+this.getDesafiante().getHp());
                           this.getDesafiado().setHpa(this.getDesafiado().getHp()-this.getDesafiante().getDano());
                              System.out.println("Soco de  "+this.getDesafiado().getNome()+"  agora a vida é:"+this.getDesafiado().getHp());

                      }

                    if(this.getDesafiado().getHp() > 0){
                            System.out.println("Quem gahou foi "+this.getDesafiado().getNome());
                             this.getDesafiado().ganharLuta();
                             this.getDesafiante().perderLuta();
                                       }                            
                    else if(this.getDesafiante().getHp() > 0){
                            
                             System.out.println("Quem ganhou foi: "+this.getDesafiante().getNome());
                             this.getDesafiante().ganharLuta();
                             this.getDesafiado().perderLuta();
                          }

                  }
                  else
                  System.out.println("A luta não pode acontecer");

}
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}

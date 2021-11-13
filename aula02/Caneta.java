package aula02;
public class Caneta {
   public String modelo;
   public String cor;
   public float ponta;
   protected int carga;
   private boolean tampada;
    public void status ( ) {
        System.out.println("É uma caneta da cor :"+ this.cor);
        System.out.println("Esta caneta está tampada :"+ this.tampada);
        System.out.println("O tamanho da ponta da caneta é :"+this.ponta);
        System.out.println("A carga desta caneta é de :"+this.carga+"%");
        System.out.println("O modelo desta caneta é :"+this.modelo);
    }
    public void rabiscar() {
      if (this.tampada == true){
          System.out.println("erro a caneta esta tampada");
      }
      else
      {
          System.out.println("Rabisco");
      }
}
    protected void tampar() {
          this.tampada = true;
}
   protected void destampar (){
        this.tampada = false;
    }
    
}

package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String color;
    private boolean tampada; 
    
    public  Caneta(String m,String c, float p){             //esse é o metódo construtor
        this.color = c;
        this.setModelo(m);
        this.ponta = p;
        this.tampar();
        
    }
    
    public void status(){
        System.out.println("Informações da caneta :");
        System.out.println("Modelo :"+this.getModelo());
        System.out.println("ponta :"+this.getPonta());
        System.out.println("Cor :"+this.color);
        System.out.println("Tampada :"+this.tampada);
        
        
        
        
    }
    public String getModelo( ){
          return this.modelo;
          
}
    public void  setModelo(String m){
        this.modelo= m;
    }
    
   public float getPonta(){
       return this.ponta;
   } 
 public void setPonta(float p){
       this.ponta = p;
   }
   private void tampar (){
       this.tampada = true;
   }
   
   private void destampar(){
       this.tampada = false;
   }
   
    
    
    
}

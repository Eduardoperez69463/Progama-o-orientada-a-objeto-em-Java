package aula05;
public class Conta {
    protected String tipo;
    private String dono;
    private boolean status;
    private int saldo;
    
    
    public Conta(String d,String t){
        this.dono = d;
        this.tipo = t;
        this.setSaldo(0);
        this.setStatus(false);
        
    }
            
    public void mostrarTudo(){
        //System.out.println(this.getDono());
       // System.out.println(this.getStatus());
        System.out.println(this.getSaldo());
        //System.out.println(this.getTipo());
    }
            
    public void abrirConta()   {
        
       if (this.getStatus() == true ){
       System.out.println("Conta já está aberta");    
       
       }
       else{
          System.out.println("Conta aberta com sucesso :) ");
          this.status = true;
             if (this.getTipo() =="cc"){
                 this.saldo = this.saldo + 50;

             }
             else if(this.getTipo() =="cp"){
                this.saldo = this.saldo +150;
   
             }
          
             }
    }
    public void  fecharConta(){
        
        if(this.getStatus() == false  ){
            System.out.println("Conta não existe");
        }
        
         else if ( this.getSaldo() > 0 ){
            System.out.println("Ainda existe dinheiro na sua conta");
        }
         
         else{
             System.out.println("Conta fechada com sucesso");
             this.status = false;
         }
        
    }
    public void depositar(int d){
        if(d >0 && this.getStatus() == true){ 
        this.saldo = this.saldo+ d;
                }
        
        
        else
            System.out.println("Valor inavlido ou conta não foi criada");
    } 
    public void  sacar(int s){
        
        if(this.saldo >= s && this.status == true ){
        this.saldo =  this.saldo - s;
         }
        else{
            System.out.println("Você não possui nenhum saldo na sua conta para sacar ou não possui conta");
        }
    }
    public void mensalidade(){
        
        if (this.getTipo()=="cc"&&saldo>=12&&this.status == true){
            this.saldo = this.saldo-12;
          //  this.setSaldo(this.getSaldo()-12);
        }
        
        else if(this.getTipo()=="cp"&&saldo>=20&&this.status == true){
            this.saldo = this.saldo-20;
        }
        else
            
        {
          System.out.println("Você não possui saldo ou não possui uma conta");
        }
        
    }
    public String getTipo(){
        return this.tipo;
    }
    public  void setTipo(String t){
        this.tipo = t ; 
    }
    public int getSaldo(){
        return this.saldo;             }
    public void setSaldo(int s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean v){
        this.status = v ; 
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono =d;
    }
    
            
 
  
    
}

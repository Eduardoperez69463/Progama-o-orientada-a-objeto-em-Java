package aula14;
 public class Espectador extends Pessoa{
     private String login;
     private int totAssistindo;
     
   
     

    public Espectador(String nome, String sexo, int idade, String login, int totAssistindo) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistindo = totAssistindo;
    }
     
     public void maisUmaVisualizacao(){
         totAssistindo++;
     }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Espectador{" + super.toString()+"login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }
     
     
    
}

package aula04;
public class Aula04 {
    public static void main(String[] args) {
               Caneta caneta = new Caneta("Bic","verde",0.5f);
               caneta.status();
               Caneta canetadois = new Caneta("AAA","Azul",1.0f);
               canetadois.status();
               caneta.setModelo("Bic");
               System.out.println(caneta.getModelo());

               
    }
    
}

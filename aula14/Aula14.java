package aula14;
public class Aula14 {
 public static void main(String[] args) {
         Video video = new Video("Video 1");
         
         //System.out.println(video.toString()); 
         Espectador pessoa = new Espectador("João","M",15,"joao555",55);
         Visualizacao v[] = new Visualizacao[4];
          v[0] = new Visualizacao(pessoa,video);
           System.out.println(v[0].toString());
         v[1] = new Visualizacao(pessoa,video);
          System.out.println(v[0].toString());
         v[2] = new Visualizacao(pessoa,video);
           v[2].avaliar(45f);
            v[2] = new Visualizacao(pessoa,video);
                   System.out.println(v[0].toString());
         v[3] = new Visualizacao(pessoa,video);
         //System.out.println(pessoa.toString());
         System.out.println(v[0].toString());
         
    }
    
}

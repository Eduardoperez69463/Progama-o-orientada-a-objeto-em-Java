package aula07;
public class Aula07 {
public static void main(String[] args) {
    
                   Lutador lutador[] = new Lutador[6];
                    lutador[0] = new Lutador("Luis","França",31,1.75f,68.9f,11,2,1);
                    lutador[1] = new Lutador("Gilton","Espanha",29,1.68f,57.9f,14,2,3);
                    lutador[2] = new Lutador("Felipe ","Italia",35,1.65f,80.9f,12,2,1);
                    lutador[3] = new Lutador("Lucas","Portugal",28,1.93f,81.6f,13,0,2);
                    lutador[4] = new Lutador("Claudio","Brasil",26,1.70f,80.9f,21,3,0);
                    lutador[5] = new Lutador("Luis","Japão",29,2181f,80.7f,15,1,0);
                    
                    
                    Luta luta =  new Luta();
                     System.out.println(lutador[5].getDano());
                //     System.out.println(lutador[5].getTotalLutas());
                     System.out.println(lutador[5].getHp());
                     System.out.println(lutador[4].getDano());
                     //System.out.println(lutador[4].getTotalLutas());
                     System.out.println(lutador[4].getHp());
                     luta.marcarLuta(lutador[4], lutador[5]);
                     luta.lutar();
                    
                    
                    
                   
      
    }
    
}

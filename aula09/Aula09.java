package aula09;
public class Aula09 {
public static void main(String[] args) {
       Pessoa pessoa[] = new Pessoa[3];
       
       pessoa[0] = new Pessoa (13,"Claudio","Masculino");
       pessoa[1] = new Pessoa (13,"Mia","Feminio");
       pessoa[2] = new Pessoa (19,"João","Masculino");
       
       Livro livro[] = new Livro[2];
      
       livro[0] = new Livro("Hannibal","Tomas",330,pessoa[2]);  
       
       livro[0].detalhes();
       livro[0].abrir();
       livro[0].folhear();
       livro[0].voltarPag();
       livro[0].avancarPag();
       livro[0].folhear();
    
    }
    
}

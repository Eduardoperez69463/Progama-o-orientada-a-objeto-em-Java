package aula11;
 public class Bolsista extends Aluno {
     
    private boolean bolsa;

    public Bolsista(boolean bolsa, String matricula, String curso, String nome, String sexo, int idade) {
        super(matricula, curso, nome, sexo, idade);
        this.bolsa = bolsa;
    }
    
    
    public void renovarBolsa(){
        this.setBolsa(!this.isBolsa());
    }
    
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Você pagou a mensalidade de bolsista "+this.getNome());
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
   
}

package aula11;
  abstract public class Aluno extends Pessoa{
    private String matricula, curso;

    public Aluno(String matricula, String curso, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    
    public  void pagarMensalidade(){
        System.out.println("Você pagou a mensalidade normal "+this.getNome());
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
     
     
}

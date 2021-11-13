package aula11;
 public class Professor extends Pessoa{
    public String especialidade;     
    public int salario;

    public Professor(String especialidade, int salario, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    
      
     public void receberAumento(int aumento){
         this.setSalario(this.getSalario()+aumento);
     }   
  
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
      

      
}

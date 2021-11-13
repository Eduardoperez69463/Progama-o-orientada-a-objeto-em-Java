package aula11;
public class Tecnico extends Aluno {
    
    private String registroProfissional;

    public Tecnico(String registroProfissional, String matricula, String curso, String nome, String sexo, int idade) {
        super(matricula, curso, nome, sexo, idade);
        this.registroProfissional = registroProfissional;
    }
    
    
    
    public void  praticar(){
        System.out.println("Você praticou!");
    }
 
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
}

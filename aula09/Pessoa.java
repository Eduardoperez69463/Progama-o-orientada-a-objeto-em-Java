package aula09;
public class Pessoa {
    private int idade;
    private String nome,sexo;

    public Pessoa(int i, String n,String s) {
       this.setIdade(i);
       this.setNome(n);
       this.setSexo(s);
    }
    
    public void infoPessoa(){
        System.out.println("===========================");
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Nome"+this.getNome());
        System.out.println("Sexo:"+this.getSexo());
        
    }
    public void fazerAniversario(){
            this.setIdade(this.getIdade()+1);
  
}
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}

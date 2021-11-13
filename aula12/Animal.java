package aula12;
 public abstract class Animal  {
     
    private int idade,peso,membros;
    
    abstract public void locomover();
    abstract public void alimentar();
    abstract public void emitirSom();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
    
    
}

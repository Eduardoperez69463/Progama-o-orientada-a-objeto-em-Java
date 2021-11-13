package aula07;

import java.util.Random;

public class Lutador {
    private String nome,categoria,nacionalidade;
    private float altura, peso;
    private int hp,dano,idade,vitorias,derrotas,empates,totalLutas;

   

 

    public Lutador(String no,String na,int id,float al,float pe,int vi,int de, int em){
        
      this.setNome(no);
      this.setNacionalidade(na);
      this.setIdade(id);
      this.setAltura(al);
      this.setPeso(pe);
      this.setVitorias(vi);
      this.setDerrotas(de);
      this.setEmpates(em);
        
    }
    
    public void apresentar(){
        System.out.println("______________________");
        System.out.println("Nome do lutador:"+this.getNome());
        System.out.println("Nacionalidade:"+this.getNacionalidade());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Altura:"+this.getAltura());
        System.out.println("Peso:"+this.getPeso());
        System.out.println("Vitorias"+this.getVitorias());
        System.out.println("Derrotas"+this.getDerrotas());
        System.out.println("Empates"+this.getEmpates());
        System.out.println("Categoria:"+this.getCategoria());
    }
    public void status(){
        System.out.println("Lutador:"+this.getNome());
        System.out.println("Categoria:+"+this.getCategoria());
        System.out.println("Vitorias:"+this.getVitorias());
        System.out.println("Derrotas:"+this.getDerrotas());
        System.out.println("Empates"+this.getEmpates());
    }
   public void ganharLuta(){
       this.setVitorias(getVitorias()+1);
       
   }
   public void perderLuta(){
       this.setDerrotas(getDerrotas()+1);
   }
   public void empatarLuta(){
       this.setEmpates(getEmpates()+1);
   }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
        this.setDano();
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
       
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if(this.getPeso()<52.22){
         this.categoria="Peso invalido";
        }
        else if(this.getPeso()<=70.33){
            this.categoria = "peso leve";
        }
        else if(this.getPeso()<=83.99){
           this.categoria = "Peso médio";
        }
        else if(this.getPeso()<=120.2){
            this.categoria ="Peso pesado";
        }
        else
            this.categoria= "peso Invalido";
            
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
        this.setDano();
        this.setTotalLutas();
       
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
        this.setTotalLutas();
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
        this.setTotalLutas();
    }
    public int getHp() {
        return hp;
    }
    public void setHp() {
        this.hp =  this.getTotalLutas()*3;
    }
    public int getDano() {
        return dano;
    }
    public void setDano() {
        Random a = new Random();
           int sorte = a.nextInt(9);
         this.dano = (this.getIdade()/10)+(this.getVitorias()/2)+sorte;
    }
    public void setDamage(int dano){
          this.dano = dano;
    }
   public void setHpa(int hp){
       this.hp = hp;
   }
    public int getTotalLutas() {
        return totalLutas;
    }
    public void setTotalLutas() {
        this.totalLutas = this.getVitorias()+this.getDerrotas()+this.getEmpates();
        this.setHp();
    }

}

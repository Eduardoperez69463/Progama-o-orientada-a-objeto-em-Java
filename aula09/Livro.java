package aula09;
public class Livro implements Publicacao{
    private String titulo,autor;
    private int totalPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.setAberto(false);
        this.setPagAtual(1);
    }
    
    
    public void detalhes(){
        System.out.println("Esse livro foi feito por:"+this.getAutor());
        System.out.println("O nome do livro é "+this.getTitulo());
        System.out.println("Ele tem:"+this.getTotalPaginas()+" paginas");
        System.out.println("Quem esta lendo ele é :"+this.getLeitor().getNome());
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public void abrir() {
       this.setAberto(true);
    }
    public void fechar() {
        this.setAberto(false);
    }
    public void folhear() {
        if(this.isAberto()==true){
        System.out.println("Esta é a pagina:"+this.getPagAtual());
        }
        else
            System.out.println("Livro esta fechado");
        
    }
    public void avancarPag() {
         if(this.isAberto()==true &&  this.getPagAtual() < this.getTotalPaginas()){
             this.setPagAtual(this.getPagAtual()+1);
         }
         else if (this.getTotalPaginas() == this.getPagAtual()){
              System.out.println("Essa é a pagina final");
         }
         else
             System.out.println("O livro está fechado não é possivel avançar");
    }
    public void voltarPag() {
         if(this.isAberto()==true && this.getPagAtual() > 1){
             this.setPagAtual(this.getPagAtual()-1);
         }
         else if(this.getPagAtual() == 1){
             System.out.println("Essa é a primeira pagina");
         }
         else
             
             System.out.println("O livro está fechado não é possivel voltar");
    }
    }
    
    
    


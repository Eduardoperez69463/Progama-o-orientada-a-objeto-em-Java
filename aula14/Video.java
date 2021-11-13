package aula14;
 public class Video implements AcoesVideo {
      private String titulo;
      private int views,curtidas,avaliacao;
      private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
    }
      

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao +avaliacao)/2;
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

   @Override
    public String toString() {
      return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}

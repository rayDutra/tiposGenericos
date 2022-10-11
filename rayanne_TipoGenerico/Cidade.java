package rayanne_TipoGenerico;

public class Cidade {
    private String nome;
    private String estado;
    private String adjetivo;

    public Cidade(String nome, String estado, String adjetivo) {
        this.nome = nome;
        this.estado = estado;
        this.adjetivo = adjetivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAdjetivo() {
        return adjetivo;
    }

    public void setAdjetivo(String adjetivo) {
        this.adjetivo = adjetivo;
    }
}

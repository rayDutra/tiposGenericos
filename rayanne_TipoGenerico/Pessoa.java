package rayanne_TipoGenerico;

public class Pessoa {
    private String nome;
    private char sexo;
    private String naturalidade;

    public Pessoa(String nome, char sexo, String naturalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char Sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.naturalidade = naturalidade;
    }
}

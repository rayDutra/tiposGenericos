package rayanne_TipoGenerico;

public class Vetor<T> {

    private Object[] vetor;
    private int tamanho;

    //inicialize somente o tamanho do vetor
    public Vetor(int tamanho) {
        vetor = new Object[tamanho];
        this.tamanho = tamanho;
    }

    // Retorna o objeto apos passado a posicao
    public T getObjeto(int posicao) {
        return (T) this.vetor[posicao];
    }

    // receberá a posição e o elemento a ser inserido
    public void adicionaObjeto(T objeto, int posicao) {
        this.vetor[posicao] = objeto;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}

import java.util.EmptyStackException;

public class PilhaComNo<E> {
    private NoSimples<E> topo;
    private int tamanho;

    public PilhaComNo(){
        this.topo = null;
        this.tamanho = 0;
    }

    public NoSimples<E> getTopo() {
        return topo;
    }

    public void setTopo(NoSimples<E> topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public boolean estaVazio() {
        return (topo == null); // ou (tamanho == 0)
    }

    public E topo() throws EmptyStackException {
        if (estaVazio()){
            throw new EmptyStackException();
        }
        return topo.getElemento();
    }

    public E pop() throws EmptyStackException {
        if (estaVazio()) {
            throw new EmptyStackException();
        }
        E elemento = topo.getElemento();
        topo = topo.getProximo();
        tamanho--;
        return elemento;
    }

    public void push(E elemento) {
        NoSimples<E> noNovo = new NoSimples<E>(elemento, topo);
        topo=noNovo;
        tamanho++;
    }

        


}


public class NoSimples<E> {
    private E elemento;
    private NoSimples<E> proximo;

    public NoSimples(E elemento, NoSimples<E> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public NoSimples<E> getProximo() {
        return proximo;
    }

    public void setProximo(NoSimples<E> proximo) {
        this.proximo = proximo;
    }

    
}
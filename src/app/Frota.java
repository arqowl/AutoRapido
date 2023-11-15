package app;

public class Frota {
    
    private Automovel Carro;
    private int Quantidade;

    public Frota(Automovel carro) {
        Carro = carro;
    }

    public Frota(Automovel carro, int quantidade) {
        Carro = carro;
        Quantidade = quantidade;
    }

    public Automovel getCarro() {
        return Carro;
    }

    public void setCarro(Automovel carro) {
        Carro = carro;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}

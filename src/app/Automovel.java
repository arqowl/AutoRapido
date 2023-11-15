package app;

public class Automovel {
    
    private Modelo Modelo;
    private Marca Marca;
    private String Placa;
    private String Cor;
    private int Ano;
    private String Combustivel;
    private int Portas;
    private Double Quilometragem;
    private String Ranavam;
    private String Chassi;
    private String ValorDeLocacao;
    private String NomeCarro;

    public Automovel(String Placa) {
        this.Placa = Placa;
    }

    public Modelo getModelo() {
        return Modelo;
    }

    public void setModelo(Modelo modelo) {
        Modelo = modelo;
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca marca) {
        Marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String combustivel) {
        Combustivel = combustivel;
    }

    public int getPortas() {
        return Portas;
    }

    public void setPortas(int portas) {
        Portas = portas;
    }

    public Double getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        Quilometragem = quilometragem;
    }

    public String getRanavam() {
        return Ranavam;
    }

    public void setRanavam(String ranavam) {
        Ranavam = ranavam;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getValorDeLocacao() {
        return ValorDeLocacao;
    }

    public void setValorDeLocacao(String valorDeLocacao) {
        ValorDeLocacao = valorDeLocacao;
    }

    public String getNomeCarro() {
        return NomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        NomeCarro = nomeCarro;
    }

    @Override
    public String toString() {
        return "Automovel [Modelo=" + Modelo + ", Marca=" + Marca + ", Placa=" + Placa + ", Cor=" + Cor + ", Ano=" + Ano
                + ", Combustivel=" + Combustivel + ", Portas=" + Portas + ", Quilometragem=" + Quilometragem
                + ", Ranavam=" + Ranavam + ", Chassi=" + Chassi + ", ValorDeLocacao=" + ValorDeLocacao + ", NomeCarro="
                + NomeCarro + "]";
    }
}

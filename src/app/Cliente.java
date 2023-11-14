package app;

public class Cliente {
    
    private String CPF;
    private String Nome;
    private Double Saldo;
    
    public Cliente(String cPF) {
        CPF = cPF;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public Double getSaldo() {
        return Saldo;
    }
    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
}

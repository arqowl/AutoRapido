package app;

import java.util.List;

public class GerenciaClientes extends Cliente {
    
    private String Nome;
    private Double Saldo;
    private List<Cliente> Clientela;

    public GerenciaClientes(String cPF) {
        super(cPF);
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

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}

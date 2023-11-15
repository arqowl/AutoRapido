package app;

import java.util.List;

public class GerenciaClientes {
    
    private List<Cliente> Clientela;

    public GerenciaClientes(List<Cliente> Clientela) {
        this.Clientela = Clientela;
    }

    private void buscarCliente(String CPF){
        Cliente aux = new Cliente(CPF);

        if (Clientela.contains(aux)) {
            System.out.println("Elemento encontrado na lista.");
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }

    private void adicionarCliente(String CPF){
        Cliente aux = new Cliente(CPF);
        Clientela.add(aux);
    }

    private void removerCliente(String CPF){
        Cliente aux = new Cliente(CPF);
        Clientela.remove(aux);
    }

    private void showClientela(){
        for (Cliente Cliente : Clientela) {
          
            System.out.println(Cliente);
        }
    }
}

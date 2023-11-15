package app;

import java.util.List;

public class GerenciaFrota {
    
    private List<Frota> frota;
    private String DataDeLocacao;
    private String DataDeDevolução;

    public GerenciaFrota(List<Frota> frota) {
        this.frota = frota;
    }

    private void buscaCarro(String Placa){
        Automovel aux = new Automovel(Placa);
        Frota auxFrota = new Frota(aux, 0)
        if (frota.contains(aux)) {
            System.out.println("Elemento encontrado na lista.");
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }

    private void alugaCarro(String Placa, int Quantidade){
        Automovel aux = new Automovel(Placa);
        Frota auxFrota = new Frota(aux);
        frota.add(aux);
    }

    private void removerCliente(String Placa){
        Automovel aux = new Automovel(Placa);
        frota.remove(aux);
    }

    private void showfrota(){
        for (Automovel Cliente : frota) {
          
            System.out.println(Cliente);
        }
    }

}

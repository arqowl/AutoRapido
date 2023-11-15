package app;

import java.util.List;

public class GerenciaFrota {
    
    private List<Frota> frota;
    private String DataDeLocacao;
    private String DataDeDevolução;

    public GerenciaFrota(List<Frota> frota) {
        this.frota = frota;
    }

    private Frota buscaFrota(String Placa){
        Automovel aux = new Automovel(Placa);
        Frota auxFrota = new Frota(aux);
        for (Frota procura : frota) {
            if (procura.equals(auxFrota)) {
                return procura; // Retorna o objeto quando encontrado
            }
        }
        return null;
    }

    private void alugaCarro(String Placa, String DataDeLocacao){
        Frota auxFrota = buscaFrota(Placa);
        auxFrota.setQuantidade(auxFrota.getQuantidade()-1);
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

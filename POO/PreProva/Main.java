package PreProva;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("HFFFGERHRE", 1999));
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        veiculos.add(new Caminhao("KHBTR", 2002, 4));
        ArrayList<Onibus> onibuss = new ArrayList<Onibus>();
        veiculos.add(new Onibus("UHTRBTI", 2001, 7));

        for(Veiculo veiculo : veiculos){
            veiculo.exibirDados();
        }
        for(Caminhao caminhao : caminhoes){
            caminhao.exibirDados();
        }
        for(Onibus onibus : onibuss){
            onibus.exibirDados();
        }
    }
}
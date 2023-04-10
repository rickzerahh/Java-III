package PreProva;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }
    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    public int getEixos(){
        return eixos;
    }
    public void exibirDados(){
        System.out.println("A placa do Caminhão é: " + placa + " seu ano de fabricação é de: " + ano + " , o número total de eixos é de: " + eixos);
    }
}
package PreProva;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public int getAssentos(){
        return assentos;
    }
    @Override
    public void exibirDados(){
        System.out.println("A placa do Ônibus é " + placa + " seu ano de fabricação é de: " + ano + " , e o total de assentos é de: " + assentos);
    }
}
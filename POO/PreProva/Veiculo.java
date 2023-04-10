package PreProva;

public class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }
    public Veiculo(){
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getPlaca(){
        return placa;
    }
    public int getAno(){
        return ano;
    }
    public void exibirDados(){
        System.out.println("A placa do carro é: " + placa + " e o ano de fabricação desse veículo é: " + ano);
    }
}
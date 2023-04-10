package Prova1;

public class Trabalhador {
    private String nome;
    private int idade;
    private double valorDaHora;
    private int horasTrabalhadas;
    private boolean ferias;

    public Trabalhador(String nome, int idade, double valorDaHora) {
        this.nome = nome;
        this.idade = idade;
        this.valorDaHora = valorDaHora;
        this.horasTrabalhadas = 0;
        this.ferias = false;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public double getValorDaHora(){
        return valorDaHora;
    }
    public void setNome(String Nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setHorasTrabalhadas(int HorasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setValorDaHora(double valorDaHora){
        this.valorDaHora = valorDaHora;
    }
    public boolean getFerias(){
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    public void Alternar() {
        if (ferias == true) {
            ferias = false;
        } else {
            ferias = true;
        }
    }
}
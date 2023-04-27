public class Veiculo{
    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragemTanque;
    private double velocidadeMax;

    public Veiculo(String marca, double tanque, double consumo, double velocidadeMax){
        this.marca = marca;
        this.estado = false;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = 0;
        this.litragemTanque = 0;
        this.velocidadeMax = velocidadeMax;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public boolean isEstado(){
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }
    public double getVelocidadeMaxima(){
        return velocidadeMax;
    }
    public void setVelocidadeMaxima(double velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
    public double getTanque(){
        return tanque;
    }
    public void setTanque(double tanque){
        this.tanque = tanque;
    }
    public double getConsumo(){
        return consumo;
    }
    public void setLitragemTanque(double litragemTanque){
        this.litragemTanque = litragemTanque;
    }
    public double getLitragemTanque(){
        return litragemTanque;
    }
    public void Chavear(){
        if(estado){
            estado = false;
        }else{
            estado = true;
        }
    }
    public void Acelerar(){
        if(estado && velocidadeAtual < velocidadeMax){
            velocidadeAtual++;
        }
    }
    public void Frear(){
        if(estado && velocidadeAtual > 0){
            velocidadeAtual--;
        }
    }
    public double Corrida(double distancia){
        double litrosGastos = distancia / consumo;
        if(litrosGastos <= litragemTanque){
            litragemTanque -= litrosGastos;
            return distancia;
        }else{
            double kmRestantes = litragemTanque * consumo;
            litragemTanque = 0;
            velocidadeAtual = 0;
            return kmRestantes;
        }
    }
}
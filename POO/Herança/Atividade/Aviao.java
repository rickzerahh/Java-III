public class Aviao extends Veiculo {
    private boolean voando;

    public Aviao(String marca, double consumo, double litragemTanque, double velocidadeMaxima, boolean voando) {
        super(marca, consumo, litragemTanque, velocidadeMaxima);
        this.voando = false;
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    @Override
    public void Chavear() {
        if (this.isVoando()) {
            System.out.println("Não é possível desligar o avião estando em movimento.");
        } else {
            super.Chavear();
        }
    }

    @Override
    public double Corrida(double distancia) {
        if (this.isVoando()) {
            if (this.getVelocidadeAtual() >= 200) {
                double litrosNecessarios = distancia / (this.getConsumo() / 2);
                if (litrosNecessarios > this.getTanque()) {
                    System.out.println("A distância solicitada excede a capacidade de combustível do avião. " +
                                       "Realizando pouso emergencial.");
                    this.voando = false;
                    this.setVelocidadeAtual(0);
                    this.setTanque(0);
                } else {
                    super.Corrida(distancia);
                }
            } else {
                System.out.println("A velocidade atual do avião é inferior a 200 km/h. " +
                                   "Realizando pouso.");
                this.voando = false;
            }
        } else {
            super.Corrida(distancia);
        }
        return distancia;
    }

    public void voar() {
        if (this.getVelocidadeAtual() >= 200) {
            this.voando = true;
            System.out.println("O avião decolou.");
        } else {
            System.out.println("A velocidade atual do avião é inferior a 200 km/h. " +
                               "Impossível decolar.");
        }
    }

    @Override
    public void Acelerar() {
        if (this.isVoando()) {
            this.setVelocidadeAtual(Math.min(this.getVelocidadeAtual() + 20, this.getVelocidadeMaxima()));
        } else {
            super.Acelerar();
        }
    }

    @Override
    public void Frear() {
        if (this.isVoando()) {
            this.setVelocidadeAtual(Math.max(this.getVelocidadeAtual() - 10, 0));
            if (this.getVelocidadeAtual() == 0) {
                System.out.println("O avião pousou.");
                this.voando = false;
            }
        } else {
            super.Frear();
        }
    }
}
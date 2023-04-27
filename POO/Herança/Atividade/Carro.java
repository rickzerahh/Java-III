public class Carro extends Veiculo{
    private String placa;

    public Carro(String marca, double consumo, double velocidadeMaxima, double litragemTanque, String placa) {
        super(marca, consumo, velocidadeMaxima, litragemTanque);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void Acelerar() {
        if (isEstado()) {
            if (getVelocidadeAtual() < getVelocidadeMaxima()) {
                if (getVelocidadeAtual() < 10) {
                    setVelocidadeAtual(10);
                } else {
                    super.Acelerar();
                }
            }
        }
    }

    @Override
    public void Frear() {
        if (getVelocidadeAtual() > 0) {
            if (getVelocidadeAtual() <= 10) {
                setVelocidadeAtual(0);
            } else {
                super.Frear();
            }
        }
    }

    @Override
    public void Chavear() {
        if (isEstado() && getVelocidadeAtual() > 0) {
            while (getVelocidadeAtual() > 0) {
                Frear();
            }
        }
        super.Chavear();
    }

    public void corrida(double distancia, double gasolinaEspecial) {
        double consumoReal = getConsumo();
        double litragemTotal = getLitragemTanque() + gasolinaEspecial;

        if (litragemTotal > getLitragemTanque()) {
            consumoReal = getConsumo() * 0.5;
        }

        double litrosNecessarios = distancia / consumoReal;

        if (litrosNecessarios <= litragemTotal) {
            double kmPercorridos = litrosNecessarios * consumoReal;
            setLitragemTanque(litragemTotal - litrosNecessarios);
            setVelocidadeAtual(getVelocidadeAtual() + 1);
            System.out.println("Você percorreu " + kmPercorridos + "km");
        } else {
            setLitragemTanque(0);
            setVelocidadeAtual(0);
            System.out.println("Você não tem combustível suficiente para completar a corrida. Faltam " + (litrosNecessarios - litragemTotal) * consumoReal + "km.");
        }
    }
}

package Prova1;

public class Empresa {
    private String nome;
    private String CNPJ;
    private Trabalhador[] trabalhadores = new Trabalhador[20];
    private String endereco;
    private int numeroDeFuncionarios;
    private String CEO;

    public Empresa(String nome, String CNPJ, String endereco, String CEO) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.CEO = CEO;
        this.numeroDeFuncionarios = 0;
    }
    public String getCNPJ(){
        return CNPJ;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCEO(){
        return CEO;
    }
    public Trabalhador[] getTrabalhadores(){
        return trabalhadores;
    }
    public int getNumeroDeFuncionarios(){
        return numeroDeFuncionarios;
    }
    public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCEO(String CEO){
        this.CEO = CEO;
    }
    public void setTrabalhadores(Trabalhador[] Trabalhadores){
        this.trabalhadores = trabalhadores;
    }
    public void setNumeroDeFuncionarios(int NumeroDeFuncionarios){
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    public void contratar(Trabalhador trabalhador) {
        if (numeroDeFuncionarios < 20) {
            trabalhadores[numeroDeFuncionarios] = trabalhador;
            numeroDeFuncionarios++;
        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }
    public void trabalhar() {
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador != null && !trabalhador.getFerias()) {
                trabalhador.setHorasTrabalhadas(trabalhador.getHorasTrabalhadas() +8);
            }
        }
    }
    /*
    public void Ferias() {
        if(Trabalhador.getFerias() == true){
            System.out.println("Trabalhador se encontrava de Férias, logo irá retornar para o Trabalho");
        }else {
            System.out.println("Trabalhador se encontra em Trabalho, logo entrará de Férias");
        }
    }
    */
    public void pagamento() {
        String[] nomes = new String[20];
        double[] salarios = new double[20];
        double total = 0;

        for (int i = 0; i < numeroDeFuncionarios; i++) {
            nomes[i] = trabalhadores[i].getNome();
            salarios[i] = trabalhadores[i].getHorasTrabalhadas() * trabalhadores[i].getValorDaHora();
            total += salarios[i];
        }

        for (int i = 0; i < numeroDeFuncionarios; i++) {
            System.out.println("Nome: " + nomes[i] + ", Salário: " + salarios[i]);
        }
        System.out.println("Total gasto com salários: " + total);
    }
}
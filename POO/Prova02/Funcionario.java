public class Funcionario extends ClienteEspecial {
    
    private String setor;
    private int id;
    private double salario;
    
    public Funcionario(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item[] carrinhoDeCompras, String setor, int id, double salario, int pontos, double saldoCompras) {
        super(nome, idade, cpf, endereco, bomCliente, carrinhoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }
    
    public void renovarEstoque(int codigo, int quantidade) {
        for (Item item : getCarrinhoDeCompras()) {
            if (item.getCodigo() == codigo) {
                item.setQtdEstoque(quantidade);
            }
        }
    }
    
    public void bloquearItem(int codigo, boolean disponibilidade) {
        for (Item item : getCarrinhoDeCompras()) {
            if (item.getCodigo() == codigo) {
                item.setDisponibilidade(disponibilidade);
            }
        }
    }
    
    public double calcularSalario() {
        return salario;
    }
    
    public String getSetor() {
        return setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

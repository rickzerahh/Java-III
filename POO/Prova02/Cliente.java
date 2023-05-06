public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private Item[] carrinhoDeCompras;

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item[] carrinhoDeCompras) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = new Item[100];
    }

    public void adicionar(Item item) {
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            if (carrinhoDeCompras[i] == null) {
                carrinhoDeCompras[i] = item;
                return;
            }
        }
    }

    public void cancelar(int codigo) {
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            if (carrinhoDeCompras[i] != null && carrinhoDeCompras[i].getCodigo() == codigo) {
                carrinhoDeCompras[i] = null;
                return;
            }
        }
    }

    public double comprar() {
        double totalGasto = 0;
        int totalItens = 0;
        for (Item item : carrinhoDeCompras) {
            if (item != null) {
                totalGasto += item.getValor();
                totalItens++;
                item.setQtdEstoque(item.getQtdEstoque() - 1);
            }
        }
        double mediaGasto = totalItens == 0 ? 0 : totalGasto / totalItens;
        carrinhoDeCompras = new Item[100];
        System.out.println("Métida de Gasto: " + mediaGasto);
        return totalGasto + (bomCliente ? totalGasto * 0.05 : 0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(Item[] carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }
}

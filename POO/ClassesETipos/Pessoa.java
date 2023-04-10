package ClassesETipos;

public class Pessoa{

    //declaração de uma variável estática
    /*a modificação deste atributo irá mudar os atributos de todos os objetos desta classe, seja cuidadoso*/
    
    public static String nacionalidade = "brasileiro";
  
    //declaração dos atributos normais da classe
  
    
    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public boolean acordado = true;
    public boolean fome = true;
    public Pessoa conjuge;
  
    //declaração do contrutor
    
    public Pessoa(String nome, int idade, double altura, double peso){
      this.nome = nome;
      this.idade = idade;
      this.altura = altura;
      this.peso = peso;
    }
  
    //gets e sets
  
    //metodos
  
    public void alternar(){
      if(acordado == true)
        acordado = false;
      else{
        acordado = true;
        fome = true;
      }
    }
    
    public void apresentar(){
      if(acordado == true)
        System.out.println("Ola, meu nome e:" + nome + " e tenho " + idade + " anos");
      else
        System.out.println("Zzzzzzz");
    }
  
    public void envelhecer(){
      idade += 1;
    }
  
    public void alimentar(String alimento){
      if(fome == true){
        System.out.println(nome + " esta se alimentando com " + alimento);
        fome = false;
      }else
        System.out.println("Não, obrigado, estou satisfeito");
    }
  
    public void casar(Pessoa pessoa){
      conjuge = pessoa;
      pessoa.conjuge = this;
    }
  
    public void apresentarCasal(){
      System.out.println("Estou casado(a) com " + conjuge.nome);
      System.out.println("Eu também estou casado(a) com: " + conjuge.conjuge.nome);
    }
}
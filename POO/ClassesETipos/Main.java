package ClassesETipos;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 22, 1.69, 70);
        Pessoa p2 = new Pessoa("Maria", 19, 1.61, 55);
    
        //testes sobre os atributos
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        
        //teste de atributos pre definidos
        
        System.out.println(p1.nome + " esta " + String.valueOf(p1.acordado));
        p1.acordado = false;
        System.out.println(p1.nome + " esta " + String.valueOf(p1.acordado));
        System.out.println(p2.nome + " esta " + String.valueOf(p2.acordado));
    
        //teste de atributos estaticos
    
        System.out.println(p1.nacionalidade + " esta tudo certo");
        System.out.println(p2.nacionalidade + " esta tudo certo");
        p1.nacionalidade = "latino americano";
        System.out.println(p1.nacionalidade + " atributo mudado");
        System.out.println(p2.nacionalidade + " atributo mudado");
    
        //testando o método de apresentação
        p1.apresentar();
        p2.apresentar();
    
        //testando a alimentação
    
        p1.alimentar("maçã");
        p2.alimentar("melancia");
        p1.alimentar("melancia");
        p1.alternar();
        p1.alimentar("melancia");
    
        //testando casamento
    
        p1.casar(p2);
        p1.apresentarCasal();
        System.out.println("-------------------------");
        p2.apresentarCasal();
        
        p1.conjuge.alimentar("uva");
        p2.alternar();
        p2.alternar();
        p1.conjuge.alimentar("uva");
        
      }
    }
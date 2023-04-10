package Simulado;

public class Professor{  
    private String nome;  
    private int idade;   
    private int matricula;     
    private Sala sala;

   public Professor(String nome, int idade, int matricula, Sala sala){
       this.nome = nome;   
       this.idade = idade;    
       this.matricula = matricula;
       this.sala = sala;
   }

   public String getNome(){
       return nome;
   }

public void setNome(String nome){
       this.nome = nome;
   }

public int getIdade(){
       return idade;
   }

public void setIdade(int idade){
       this.idade = idade ;
}

public int getMatricula(){
       return matricula;
}

public void setMatricula(int matricula){ 
       this.matricula = matricula ;
}

public Sala getSala() {   
       return sala; 
} 
  
public void iniciarAula(){  
           if(!sala.isOcupada()){
               System.out.println("A aula está acontecendo com o professor(a) " +nome+ " e sua matriculade é "+matricula+".");
              sala.Alternar();
          } else{    
         System.out.println("Sala ocupada.");
     }
  }
public void chamada(boolean[] presenca) {
    for (int i = 0; i < presenca.length; i++) {
        Aluno aluno = sala.getTurma()[i];
        if (aluno != null) {
            aluno.getPresenca()[sala.getDiaDeAula()] = presenca[i];
            }
        }
    }
    public void terminarAula() {
        if (!sala.isOcupada()) {
            System.out.println("Não há aula na sala.");
        } else {
            sala.Alternar();
            sala.incrementarDiaDeAula();
            System.out.println("A aula terminou com o professor " + nome + " (Matrícula: " + matricula + ")");
        }
    }
}
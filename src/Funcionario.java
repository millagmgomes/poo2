public class Funcionario {
// classe generica, uma classe com todas as informaçoes necessarias para se trabalhar com
// outras classes atraves da herança

    //atributos
    String nome;
    private float salario;
    int idade;

    //construtores
    public Funcionario() {
        nome = "";
        salario = 0;
        idade = 0;
    }

    public Funcionario(String nome, float salario, int idade){
        //this funciona para procurar os atributos especificos de uma classe.
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    // metodos - acoes que vamos realizar

    //metodos gets (metodos se retorno)
    public String getNome(){
        return  nome;
    }

    //metodos sets (mudanca)
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //metodos da logica do negocio
    public void apresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
        System.out.println("Idade: "+idade);
    }


}



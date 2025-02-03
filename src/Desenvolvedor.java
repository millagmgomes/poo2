public class Desenvolvedor extends Funcionario {

    //atributos
    private String linguagem;
    private String cargo;
    private String nivel;

    public Desenvolvedor(String nome, float salario, int idade, String linguagem, String cargo, String nivel){
        super(nome, salario, idade);
        this.linguagem = linguagem;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    public String getLinguagem(){
        return linguagem;
    }

    public void setLinguagem(String cargo){
        this.linguagem = linguagem;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(){
        this.nivel = nivel;
    }

    public String getCargo(){
        return cargo = cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    //sobreescrita - polimorfismo
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Linguagem: "+linguagem);
        System.out.println("Cargo: "+cargo);
        System.out.println("Nivel: "+nivel);
    }

    //polimorfismo - subrecarga
    public void programar(){
        System.out.println("Codando...");
    }

    public void programar(String opcao){
        System.out.println("Codando mais lento");
    }

    public void programar(int horario){
        System.out.println("Codando as "+ 13+"h.");
    }
}

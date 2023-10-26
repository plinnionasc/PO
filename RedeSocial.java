package exemploclassearraylist;

public class RedeSocial {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionario;
    private Funcionario[] funcionarios = new Funcionario[100]; // Array para até 100 funcionários


    public RedeSocial(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }


}

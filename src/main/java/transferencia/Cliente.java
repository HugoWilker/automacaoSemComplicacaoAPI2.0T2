package transferencia;

public class Cliente {

    //objetos
    private String nome;
    private String cpf;
    private String rg;

    //construtor
     public Cliente(String nome, String cpf, String rg){ //atributo
        this.nome = nome;
        this.cpf =  cpf;
        this.rg = rg ;


     }
    //metodos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}

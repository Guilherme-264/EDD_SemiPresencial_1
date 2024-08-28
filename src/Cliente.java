public class Cliente {
    private String nome;
    private String telefone;
    private String email;

    //construtor
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //recebe String e altera o telefone
    public void  alterarTelefone(String telefone){
        this.telefone = telefone;
        System.out.println("O telefone foi alterado");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + '\n'+
                "Telefone: " + telefone + '\n'+
                "Email: " + email;
    }
}

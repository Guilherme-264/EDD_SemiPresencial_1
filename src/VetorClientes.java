public class VetorClientes {
    public Cliente[] clientes;
    public int posicaoAtual = 0;


    // construtor
    public VetorClientes(int tamanhoLista) {
    this.clientes = new Cliente[tamanhoLista];
    }

    //classe que duplica o tamanho do vetor
    private void aumentarVetor(){
        Cliente[] novaLista = new Cliente[clientes.length * 2];
        for (int i = 0; i < clientes.length; i++) {
            novaLista[i] = clientes[i];
        }
        clientes = novaLista;
    }

    //adiciona cliente na próxima posição vasia do vetor
    public void adicionarCliente(Cliente cliente){
        if (posicaoAtual < clientes.length) {
            clientes[posicaoAtual] = cliente;
            posicaoAtual++;
            System.out.println("Cliente adicionado ao vetor");
        }else{
            aumentarVetor();
            clientes[posicaoAtual] = cliente;
            posicaoAtual++;
            System.out.println("O vetor foi aumentado");
        }
    }

    //retorna todos os clientes com o nome procurado
    public String retornarPeloNome(String nome){
        String str = " ";
        for (int i = 0; i < posicaoAtual; i++) {
            if (nome == clientes[i].getNome()){
                str += clientes[i].toString() + '\n' + " ";
            }
        }
        if(str != " "){
            return str;
        }else {
            return "Nome não encontrado";
        }
    }

    //retorna os clientes com o dominio do email procurado
    public String retornaPeloDominio(String dominio){
        String str = " ";

        for (int i = 0; i < posicaoAtual; i++) {
            String[] emails = clientes[i].getEmail().split("@");
            if (emails[1].equals(dominio) ){
                str += clientes[i].toString() + '\n' + " ";
            }
        }
        if(!str.equals(" ")){
            return str;
        }else {
            return "Dominio não encontrado";
        }
    }

    //recebe a posição e o novo telefone, e altera o telefone
    public void alterarTelefone(int c1, String telefone){
        clientes[c1].alterarTelefone(telefone);
    }

    //recebe uma posição, exclui o cliente dessa posição e organiza o vetor
    public void excluirCliente(int posicao) {
        int proximaPosicao = posicao +1;
        for (int i = posicao; i < posicaoAtual -1; i++) {
            clientes[i] = clientes[proximaPosicao];
            proximaPosicao++;
        }
        clientes[posicaoAtual] = null;
        posicaoAtual--;
        System.out.println("Cliente excluido");
    }

    //recebe um cliente e a posição, organiza o vetor e adiciona o cliente
    public void adicionarEmPosicaoExpecifica(Cliente cliente, int posicao){
//        Cliente clienteAtual;
        for (int i = posicaoAtual; i > posicao ; i--) {
//            clienteAtual = clientes[i];
            clientes[i] = clientes[i-1];
        }
        clientes[posicao] = cliente;
        posicaoAtual++;
    }

    //retorna todos os clientes do vetor
    public String ToString(){
        String str = "Clientes: ";
        for (int i = 0; i <  posicaoAtual-1; i++) {
            str += clientes[i].getNome() +", ";
        }
        str += clientes[posicaoAtual-1].getNome() + ".";
        return str;
    }
}

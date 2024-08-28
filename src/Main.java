public class Main {
    public static void main(String[] args) {
        VetorClientes listaClientes = new VetorClientes(20);


        //criando alguns clientes
        Cliente cliente1 = new Cliente("Guilherme", "(51)1826112", "guilherme@gmail.com");
        Cliente cliente2 = new Cliente("Marcio", "(54)18124591", "marcio@gmail.com");
        Cliente cliente3 = new Cliente("Caça Rato", "(54)2514889", "cacaratojr@hotmail.com");
        Cliente cliente4 = new Cliente("Caça Rato", "(51)1826112", "rato@outlook.com");
        Cliente cliente5 = new Cliente("Neymar", "(48)1826112", "neymar@hotmail.com");
        //adicionando os clientes ao vetor
        listaClientes.adicionarCliente(cliente1);
        listaClientes.adicionarCliente(cliente2);
        listaClientes.adicionarCliente(cliente3);
        listaClientes.adicionarCliente(cliente4);
        listaClientes.adicionarCliente(cliente5);

        //criando mais clientes e adicionando no vetor através da estrutura de repetição for
        for (int i = 0; i < 25; i++) {
            Cliente cliente = new Cliente("clientei"+i, "(51)" + i, "nome@exemplo.com");
            listaClientes.adicionarCliente(cliente);
        }

        //excluindo cliente do vetor da posição 21
        listaClientes.excluirCliente(21);

       //criando cliente e adicionando na posição 21
        Cliente cliente = new Cliente("Pelé", "(21)99512648", "pele@yahoo.com");
        listaClientes.adicionarEmPosicaoExpecifica(cliente, 21);

        //alterando telefone do cliente da posição 18
        listaClientes.alterarTelefone(18,"(48)991281251");

        //buscando todos os clientes com o nome Caça Rato
        System.out.println(listaClientes.retornarPeloNome("Caça Rato"));

        //buscando todos os clientes com o dominio de email "gmail.com"
        System.out.println("Clientes com email com dominio gmail.com: \n" + listaClientes.retornaPeloDominio("gmail.com"));

        //printado todos os clientes adicionados no vetor
        System.out.println(listaClientes.ToString());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa brinkStore = new Empresa();

        Scanner scanner = new Scanner(System.in);
        String brinquedo = "";
        Double valor = 0.0;
        String brinquedo2 = "";
        Double valor2 = 0.0;

        // Obtendo dados para inserir o produto
        System.out.println("Digite o Produto:");
        brinquedo = scanner.nextLine();

        System.out.println("Digite o valor:");
        valor = scanner.nextDouble();

        // Obtendo dados produto 2
        System.out.println("Digite o Produto: ");
        brinquedo2 = scanner.next();
        System.out.println("Digite o valor:");
        valor2 = scanner.nextDouble();

        Produto carrinhoControle = new Produto(brinquedo, valor);
        Produto boneca = new Produto(brinquedo2, valor2);

        // adiocionando produtos na empresa
        brinkStore.addProduto(carrinhoControle);
        brinkStore.addProduto(boneca);

        // add vendedor
        Vendedor jao = new Vendedor("Jao", "4201.3123-00", 10);
        Vendedor silva = new Vendedor("Silva", "9313.413-00", 10);

        brinkStore.addVendedor(jao);
        brinkStore.addVendedor(silva);

        System.out.println(brinkStore.getVendedores());

        // add cliente
        Cliente zequinha = new ClienteFisico("Zequinha", "9990-9999", "44343.4343-00");
        Cliente maria = new ClienteJuridico("Maria", "9922-9319", "55143.49983-00");

        brinkStore.addCliente(zequinha);
        brinkStore.addCliente(maria);
        // efetuando pedido
        jao.efetuarPedido(zequinha);
        silva.efetuarPedido(maria);
        System.out.println(silva.getPedido());

        // adicionando produtos no pedido
        jao.addProduto(carrinhoControle);
        jao.addProduto(boneca);

        silva.addProduto(carrinhoControle);
        silva.addProduto(boneca);

        System.out.println(jao.getPedido().getValorTotal());

        System.out.println(jao.getPedido().getProdutos());

        System.out.println(silva.getPedido().getValorTotal());
        System.out.println(silva.getPedido().getProdutos());

        // efetuando desconto
        silva.desconto(30.00);

        //linha comentada pois dara erro de Exeption, intensionalmente para não permitir desconto em clientes fisicos
        //jao.desconto(20);

        System.out.println(silva.getPedido().getValorTotal());
        System.out.println(jao.getPedido().getValorTotal());


        brinkStore.addPedido(silva.getPedido());
        brinkStore.addPedido(jao.getPedido());
        System.out.println(brinkStore.getPedidos());

    }
}

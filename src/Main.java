import cliente.Cliente;
import cliente.ClienteFisico;
import cliente.ClienteJuridico;
import company.Empresa;
import produto.Brinquedo;
import produto.Produto;
import company.Vendedor;
import produto.Utilidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa brinkStore = new Empresa();

        Scanner scanner = new Scanner(System.in);
        String brinquedoName = "";
        Double valor = 0.0;
        String utilidadeName = "";
        Double valorUtil = 0.0;
        Boolean imetro;
        int unidadeEmbal;


        // adiocionando produtos na empresa
        brinkStore.addProdUtilidade();
        brinkStore.addProdUtilidade();

        // add vendedor
        Vendedor jao = new Vendedor("Jao", "4201.3123-00", 10, brinkStore);
        Vendedor silva = new Vendedor("Silva", "9313.413-00", 10, brinkStore);

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
        jao.addProduto(jao.getEmpresa().getProdutos().get(0));
        jao.addProduto(jao.getEmpresa().getProdutos().get(1));

        //adicionando produtos no outro pedido
        silva.addProduto(jao.getEmpresa().getProdutos().get(0));
        silva.addProduto(jao.getEmpresa().getProdutos().get(1));

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

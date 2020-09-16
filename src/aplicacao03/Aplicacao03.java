/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao03;

import Entidades.Cliente;
import Entidades.Enums.Status;
import Entidades.PedidoItem;
import Entidades.Pedidos;
import Entidades.Produtos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
    EXERCÍCIO FEITO EM AULA DO CURSO JAVA COMPLETO 2020 DO PROF. NÉLIO ALVES
 */
public class Aplicacao03 {

    
    
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- Dados do cliente --");
        System.out.println();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        Date dataNascimento = sdf.parse(sc.next());        
        
        Cliente cliente = new Cliente(nome, email, dataNascimento);
        
        System.out.println("-- Dados do pedido --");
        System.out.println();
        System.out.print("Status do pedido: ");
        Status status = Status.valueOf(sc.next());
        
        Pedidos pedido = new Pedidos(new Date(), status, cliente);
        
        System.out.print("Quantos itens tem o pedido? ");
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            System.out.println("Dados do #" + (1+i) + " produto");
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            
            Produtos produto = new Produtos(nome, preco);
            PedidoItem pI = new PedidoItem(quantidade, preco, produto);
            pedido.addPedido(pI);
        }
        System.out.println();
        System.out.println(pedido);
        sc.close();
    }
    
}

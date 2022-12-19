package application;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("\nInsira os dados do produto:");
		System.out.print("Nome: ");
		produto.nome=sc.nextLine();
		System.out.print("Preco: ");
		produto.preco= sc.nextDouble();
		System.out.print("Quantidade no  estoque: ");
		produto.quantidades= sc.nextInt();
		
		System.out.println(produto);
		System.out.print("\nDeseja alterar o estoque s/n? ");
		char opcao = sc.next().charAt(0);
		
		int alteracao;
		
		if(opcao == 's'){
			
			System.out.print("\nPara adicionar produto no estoque digite- 1");
			System.out.print("\nPara remover produto no estoque digite- 2");
			System.out.println("\nInsira: ");
			alteracao = sc.nextInt();
			
			if(alteracao==1) {
				System.out.print("\nInsira o numero de produto, para ser adicionado no estoque: ");
				produto.adicionarProduto(sc.nextInt());
			}
			else {
				System.out.print("\nEntre com o numero de produto, para ser removido do estoque: ");
				produto.removerProduto(sc.nextInt());
			}
		}
		
		System.out.println("\nOperacao finalizada"+produto);
		sc.close();
	}

}

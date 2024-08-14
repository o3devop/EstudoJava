package Application;

import java.util.Scanner;

public class Program {
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- SISTEMA DE GESTÃO INTEGRADO ----");
		System.out.println("---- --------------------------- ----");
		System.out.println("---- Estoque ----");
		System.out.println("Informe o nome do produto: ");
		String produto = sc.nextLine();
		System.out.println("Informe quantidade em estoque: ");
		int estoque = sc.nextInt();
		System.out.println("Informe valor do produto: ");
		Double valorItem = sc.nextDouble();
		
		System.out.println("Produto:" + produto + "Em estoque: " + estoque 
				+ "Valor do Item: R$" + String.format("%.2f", valorItem));
		
		System.out.println("---- Estoque ----");
		sc.nextLine();
		System.out.println("Informe o nome do Cliente: ");
		String cliente = sc.nextLine();
		System.out.println("Informe o e-mail do Cliente: ");
		String email = sc.nextLine();
		
		System.out.println("Cliente:" + cliente + "e-mail: " + email);
		
		System.out.println("---- Pedido ----");
		
		System.out.println("Informe quantidade de itens vendidos: ");
		int vendidos = sc.nextInt();
		sc.nextLine();
		
		if (vendidos > estoque) {
			
			System.out.println("Não há em estoque a quantidade desejada do item " + produto);
			int itensFaltando = vendidos - estoque;
			System.out.println("No momento só há em estoque " + estoque 
					+ " unidades do item " + produto);
			System.out.println("Faltam " + itensFaltando + " unidades do item " 
			+ produto + " para que a venda possa ser finalizada." );
		}
		
		else {
			double total = vendidos * valorItem;
			System.out.print("Valor total da compra: R$" + String.format("%.2f",total));
		}
		
		
		
			
		sc.close();
		
	}

}

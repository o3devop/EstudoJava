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
		
		System.out.println("Informe quantidade de bolos vendidos: ");
		int vendidos = sc.nextInt();
		sc.nextLine();
		double total = vendidos * valorItem;
		System.out.print("Valor total da compra: " + total );
		
		
			
		sc.close();
		
	}

}

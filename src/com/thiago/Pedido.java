package com.thiago;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	Scanner ler = new Scanner(System.in);
	ListagemItem list = new ListagemItem();
	int opcao;
	ArrayList pratos = new ArrayList();
	ArrayList bebidas = new ArrayList();
	ArrayList vinhos = new ArrayList();

	String arrayPrato[] = new String[2];
	String arrayBebida[] = new String[2];
	String arrayVinho[] = new String[2];

	float valorTotal = 0;

	String prato = "";
	String bebida = "";
	String vinho = "";

	public void CadastrarPedido() throws IOException {
		System.out.println("Iniciando pedido...");
		pratos = list.ListarPrato();
		System.out.println("Informe o código do Prato que deseja: ");
		opcao = ler.nextInt();

		if (opcao != 0) {
			opcao = opcao - 1;
		}

		String dados = (String) pratos.get(opcao);
		arrayPrato = dados.split(";");
		prato = arrayPrato[0];
		valorTotal = Float.parseFloat(arrayPrato[0]);

		bebidas = list.ListarBebida();
		System.out.println("Informe o código da Bebida que deseja: ");
		opcao = ler.nextInt();

		if (opcao != 0) {
			opcao = opcao - 1;
		}
		String dados2 = (String) bebidas.get(opcao);
		arrayBebida = dados2.split(";");
		bebida = arrayBebida[1];
		valorTotal = Float.parseFloat(arrayBebida[0]) + valorTotal;

		vinhos = list.ListarVinho();
		System.out.println("Informe o código do Vinho que deseja: ");
		opcao = ler.nextInt();
		if (opcao != 0) {
			opcao = opcao - 1;
		}
		String dados3 = (String) vinhos.get(opcao);
		arrayVinho = dados3.split(";");
		vinho = arrayVinho[1];
		valorTotal = Float.parseFloat(arrayVinho[0]) + valorTotal;

		System.out.println("Pedido executado, o mesmo será entregue em sua mesa!");

		System.out.println("\n                  ===================================");
		System.out.println("                  |     Prato: " + prato + "              ");
		System.out.println("                  |     Bebida: " + bebida + "            ");
		System.out.println("                  |     Vinho: " + vinho + "              ");
		System.out.println("                  |                                   ");
		System.out.println("                  |                                   ");
		System.out.println("                  |                                   ");
		System.out.println("                  |     VALOR TOTAL:  " + valorTotal + "  ");
		System.out.println("                  ===================================\n");

		String path2 = "C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pedidos.txt";
		try (FileWriter fw = new FileWriter(path2, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(prato + ";" + bebida + ";" + vinho + ";" + valorTotal);
		} catch (IOException e) {
			System.out.println("Não consegui gravar!");
		}
	}

	public void RelatorioPedido() throws IOException {
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pedidos.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String array[] = new String[2];
			array = linha.split(";");
			if (!linha.isEmpty()) {
				valorTotal = Float.parseFloat(array[3]);
				valorTotal = valorTotal + valorTotal;
				System.out.println(valorTotal);
			}
		}
		linha = br.readLine();
	}

	public void Relatorio() throws IOException {
		System.out.println("Iniciando listagem de bebidas...");
		float valorRelat = 0;
		int qtdPedido = 0;
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pedidos.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String arrayRelat[] = new String[4];
			if (!linha.isEmpty()) {			
				qtdPedido = qtdPedido + 1;
				arrayRelat = linha.split(";");
				valorRelat = Float.parseFloat(arrayRelat[3]) + valorRelat;
				
			}
			linha = br.readLine();
		}
		System.out.println("------------------------------VALOR TOTAL DE PEDIDOS------------------------------------");
		System.out.println(valorRelat);
		System.out.println("------------------------------QUANTIDADE TOTAL PEDIDOS----------------------------------");
		System.out.println(qtdPedido);
		
	}
}

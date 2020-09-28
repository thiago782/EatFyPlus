package com.thiago;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import com.thiago.CadastrarItem;

public class App {

	public static void main(String[] args) throws IOException {
		int opcao = 0;
		String nome = "";
		float preco = 0;


		int codPed = 0;
		CadastrarItem cad = new CadastrarItem();
		ListagemItem list = new ListagemItem();
		DeletarItem del = new DeletarItem();
		AlterarItem alt = new AlterarItem();
		Pedido ped = new Pedido();
		
		do {
			System.out.println("Bem Vindo a EatFy, selecione uma Opção: ");
			System.out.println("\n                  ===================================");
			System.out.println("                  |     1 - CADASTRAR NOVO PRATO    |");
			System.out.println("                  |     2 - CADASTRAR NOVA BEBIDA   |");
			System.out.println("                  |     3 - CADASTRAR NOVO VINHO    |");
			System.out.println("                  |     4 - LISTAR TODOS OS PRATOS  |");
			System.out.println("                  |     5 - LISTAR TODOS AS BEBIDAS |");
			System.out.println("                  |     6 - LISTAR TODOS OS VINHOS  |");
			System.out.println("                  |     7 - NOVO PEDIDO             |");
			System.out.println("                  |     8 - DELETAR PRATO           |");
			System.out.println("                  |     9 - DELETAR BEBIDA          |");
			System.out.println("                  |    10 - DELETAR VINHO           |");
			System.out.println("                  |    11 - ALTERAR PRATO           |");
			System.out.println("                  |    12 - ALTERAR BEBIDA          |");
			System.out.println("                  |    13 - ALTERAR VINHO           |");
			System.out.println("                  |    14 - RELATORIO DE PEDIDOS    |");
			System.out.println("                  |     0 - Sair                    |");
			System.out.println("                  ===================================\n");

			Scanner ler = new Scanner(System.in);
			System.out.println("Digite uma opção: ");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				cad.CadastrarPrato();
				break;

			case 2:
				cad.CadastrarBebida();
				break;

			case 3:
				cad.CadastrarVinho();
				break;
			case 4:
				list.ListarPrato();
				break;
			case 5:
				list.ListarBebida();
				break;
			case 6:
				list.ListarVinho();
				break;
			case 7:
				ped.CadastrarPedido();
				break;
			case 8:
				del.DeletarPrato();
				break;
			case 9:
				del.DeletarBebida();
				break;
			case 10:
				del.DeletarVinho();
				break;
			case 11:
				alt.AlterarPrato();
				break;
			case 12:
				alt.AlterarBebida();
				break;
			case 13:
				alt.AlterarVinho();
				break;
			case 14:
				ped.Relatorio();
				break;
			

			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		}while(opcao!=0);System.out.println("Até a próxima!");
}}

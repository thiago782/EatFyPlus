package com.thiago;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class DeletarItem {
	ListagemItem list = new ListagemItem();
	Scanner ler = new Scanner(System.in);
	int opcao = 0;
	ArrayList prato = new ArrayList();
	ArrayList bebida = new ArrayList();
	ArrayList vinho = new ArrayList();
	

	public void DeletarPrato() throws IOException {
		list.ListarPrato();

		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o c�digo do prato que deseja alterar: ");
		opcao = ler.nextInt();
		
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pratos.csv");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		
		int pos = 1;
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				array = linha.split(";");
				if(array[1] != null) {
				String dado = array[0] + ";" + array[1];
				prato.add(dado);
				dado = null;
				array = null;
				
				}
			}
			pos = pos + 1;
			linha = br.readLine();
		}
		if(opcao != 0){
			opcao = opcao - 1;
		}
		prato.remove(opcao);
		for (Object object : prato) {
			System.out.println(object);
		}
		File file = new File("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pratos.csv");
		Writer out = new FileWriter(file);
	    out.write("");
	    out.flush();
		
		int cont = 0;

		
		try (FileWriter fw = new FileWriter("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pratos.csv", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter outer = new PrintWriter(bw)) {
			for (Object object : prato) {
				System.out.println(object.toString());
				outer.println(object.toString());
				cont = cont + 1;
			}
		} catch (IOException e) {
			System.out.println("N�o consegui gravar!");
		}
		prato.clear();
		cont = 0;


	}

	public void DeletarBebida() throws IOException {
		list.ListarBebida();
		System.out.println("Insira o c�digo da bebida que deseja deletar: ");
		opcao = ler.nextInt();
		
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\bebidas-1.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		
		int pos = 1;
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				array = linha.split(";");
				if(array[1] != null) {
				String dado = array[0] + ";" + array[1];
				bebida.add(dado);
				dado = null;
				array = null;
				
				}
			}
			pos = pos + 1;
			linha = br.readLine();
		}
		if(opcao != 0){
			opcao = opcao - 1;
		}
		bebida.remove(opcao);
		for (Object object : bebida) {
			System.out.println(object);
		}
		File file = new File("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\bebidas-1.txt");
		Writer out = new FileWriter(file);
	    out.write("");
	    out.flush();
		
		int cont = 0;

		
		try (FileWriter fw = new FileWriter("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\bebidas-1.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter outer = new PrintWriter(bw)) {
			for (Object object : bebida) {
				System.out.println(object.toString());
				outer.println(object.toString());
				cont = cont + 1;
			}
		} catch (IOException e) {
			System.out.println("N�o consegui gravar!");
		}
		bebida.clear();
		cont = 0;

	}

	public void DeletarVinho() throws IOException {
		list.ListarVinho();
		System.out.println("Insira o c�digo do vinho que deseja deletar: ");
		opcao = ler.nextInt();

		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\vinhos-1.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		
		int pos = 1;
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				array = linha.split(";");
				if(array[1] != null) {
				String dado = array[0] + ";" + array[1];
				vinho.add(dado);
				dado = null;
				array = null;
				
				}
			}
			pos = pos + 1;
			linha = br.readLine();
		}
		if(opcao != 0){
			opcao = opcao - 1;
		}
		vinho.remove(opcao);
		for (Object object : vinho) {
			System.out.println(object);
		}
		File file = new File("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\vinhos-1.txt");
		Writer out = new FileWriter(file);
	    out.write("");
	    out.flush();
		
		int cont = 0;

		
		try (FileWriter fw = new FileWriter("C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\vinhos-1.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter outer = new PrintWriter(bw)) {
			for (Object object : vinho) {
				System.out.println(object.toString());
				outer.println(object.toString());
				cont = cont + 1;
			}
		} catch (IOException e) {
			System.out.println("N�o consegui gravar!");
		}
		vinho.clear();
		cont = 0;

	}

}

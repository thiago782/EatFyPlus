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

public class ListagemItem {
	Scanner ler = new Scanner(System.in);
	int numerador = 0;
	ArrayList pratos = new ArrayList();
	ArrayList bebidas = new ArrayList();
	ArrayList vinhos = new ArrayList();

	public ArrayList ListarPrato() throws IOException {
		System.out.println("Iniciando listagem de pratos...");
		numerador = 0;
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\pratos.csv");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				numerador = numerador + 1;
				array = linha.split(";");
				System.out.println(numerador + " | " + "Prato: " + array[1] + "           Valor: R$" + array[0]);
				System.out.println("-------------------------------------------------------------------");
				if (array[1] != null) {
					String dado = array[0] + ";" + array[1];
					pratos.add(dado);
				}
			}
			linha = br.readLine();
		}
		return pratos;
	}

	public ArrayList ListarBebida() throws IOException {
		System.out.println("Iniciando listagem de bebidas...");
		numerador = 0;
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\bebidas-1.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				numerador = numerador + 1;
				array = linha.split(";");
				System.out.println(numerador + " | " + "Bebida: " + array[1] + "           Valor: R$" + array[0]);
				System.out.println("-------------------------------------------------------------------");
				
				if (array[1] != null) {
					String dado = array[0] + ";" + array[1];
					bebidas.add(dado);
				}
			}
			linha = br.readLine();
		}
		return bebidas;
	}

	public ArrayList ListarVinho() throws IOException {
		System.out.println("Iniciando listagem de vinhos...");
		numerador = 0;
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\thiag\\eclipse-workspace\\EatFyPlus\\src\\data\\vinhos-1.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String array[] = new String[2];
			if (!linha.isEmpty()) {
				numerador = numerador + 1;
				array = linha.split(";");
				System.out.println(numerador + " | " + "Bebida: " + array[1] + "           Valor: R$" + array[0]);
				System.out.println("-------------------------------------------------------------------");
				if (array[1] != null) {
					String dado = array[0] + ";" + array[1];
					vinhos.add(dado);
				}
			}
			linha = br.readLine();
		}
		return vinhos;

	}

}

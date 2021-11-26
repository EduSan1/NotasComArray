package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Media;

public class App {

	public static void main(String[] args) {
		
		Media media = new Media();
		
		System.out.print("qauntas notas você precisa?");
		Scanner entrada = new Scanner(System.in);
		int numeroDeNotas = entrada.nextInt();
		
		media.receberNotas(numeroDeNotas);
		media.exibirNota();
		System.out.println(media.calcularMedia(numeroDeNotas));

	}

}

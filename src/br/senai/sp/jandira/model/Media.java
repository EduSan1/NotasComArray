package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	ArrayList<Double> arrMedia = new ArrayList<Double>();

	Scanner entrada;
	private double soma;
	private double media;

	public Media() {

		entrada = new Scanner(System.in);
	}

	public void receberNotas(int numeroDeNotas) {

		for (int i = 1; i <= numeroDeNotas; i++) {

			System.out.println("Digite a " + i + " nota: ");
			arrMedia.add(entrada.nextDouble());

		}

	}

	public void exibirNota() {

		for (int i = 0; i < arrMedia.size(); i++) {

			System.out.println("NOTA " + (i + 1) + " " + arrMedia.get(i));

		}

	}

	public double calcularMedia(int numeroDeNotas) {

		arrMedia.forEach(nota -> {
			soma += nota;
		});
		media = soma / numeroDeNotas;
		return media;
	}

}

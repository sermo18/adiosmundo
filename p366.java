package Aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nbuenos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean terminar = true;
		do {
			
			int casosdeprueba = sc.nextInt();
			ArrayList<ninyo> listaNinyos = new ArrayList<ninyo>();
			
			if (casosdeprueba != 0) {
				while (casosdeprueba != 0) {
					int bondad = sc.nextInt();
					int pesoregalo = sc.nextInt();
					if (bondad <= 100 && pesoregalo <= 1000) {
						ninyo c1 = new ninyo(bondad, pesoregalo);

						listaNinyos.add(c1);
					}

					casosdeprueba--;
				}

				Collections.sort(listaNinyos);
				for (int i = 0; i < listaNinyos.size(); i++) {
					System.out.println(listaNinyos.get(i));
				}
				System.out.println();

			} else
				terminar = false;

		} while (terminar);
	}

}

class ninyo implements Comparable<ninyo> {

	public int peso;
	public int bondad;

	public ninyo(int bondad, int peso) {

		this.peso = peso;
		this.bondad = bondad;

	}

	@Override
	public String toString() {
		
		return bondad + " " + peso;
	}

	@Override
	public int compareTo(ninyo a) {

		if (this.bondad != a.bondad) {
			return a.bondad - this.bondad;

		} else if (this.peso != a.peso) {
			return this.peso - a.peso;
		} else
			return 0;

	}

}

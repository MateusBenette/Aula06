import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {
		int vetor[] = new int[6];
		Scanner leitor = new Scanner(System.in);
		for (int i=0; i<6; i++) {
			System.out.println("Digite o ano de lan�ando de um filme");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.println("Na primeira posi��o tem " + vetor[0]);
		System.out.println("Na segunda posi��o tem " + vetor[1]);
	}

}

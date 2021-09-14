package MeuAnimalDeEstimação;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		MeuAnimalGato gato = new MeuAnimalGato();
		
		System.out.println("Seja Bem-Vind0!");
		System.out.println("Seu animal de estimação gato, começa com três coisas fundamentais para ir subindo de nivel");
		System.out.println("descanso = 0, felicidade = 0, fomeSaciada = 0");
		System.out.println("O jogo acaba quando todos os requisitos estão em 100");
		System.out.println("Deseja jogar? 0 - sim____1 - não");
		int respostaUsuario = t.nextInt();
		Limpar();
		
		while(respostaUsuario == 0) {
			
			do{
				
				System.out.println(">^.^< 'MEOW'");
				System.out.println("----------------");
				System.out.println("1 - Dar comida");
				System.out.println("2 - Dormir");
				System.out.println("3 - Acordar");
				System.out.println("4 - Brincar");
				int menuDeEscolhas = t.nextInt();
				
				if(menuDeEscolhas > 4 || menuDeEscolhas < 0)
				{
					System.out.println("Digite novamente um número que esteja dentro das opções");
				}
				else
				{
				
					switch(menuDeEscolhas) {
					
					case 1:
						gato.darComida();
						break;
					case 2:
						gato.dormindo();
						break;
					case 3:
						gato.acordar();
						break;
					case 4:
						gato.brincar();
					}
				
					gato.informacoes();
				}

				
			}while(gato.fomeSaciada < 100 || gato.descanso < 100 || gato.felicidade < 100);
			Limpar();
			
			System.out.println("Parabens! Você zerou o jogo, deseja jogar novamente? 0 - sim____1 - não");
			respostaUsuario = t.nextInt();
			Limpar();

			
		}
		Limpar();
		System.out.println("Programa encerrado");
		t.close();
		

	}

	public static void Limpar() {
		
		for (int i = 0; i < 50; ++i) System.out.println ();
	}
}

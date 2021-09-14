package MeuAnimalDeEstimação;

public class MeuAnimalGato {
	
	int fomeSaciada = 0;
	
	int descanso = 0;
	
	int felicidade = 0;
	
	boolean dormir;
	
	public void informacoes()
	{
		System.out.println("Seu gato está com " + this.felicidade + " de felicidade");
		System.out.println("Seu gato está com " + this.descanso + " de descanso");
		System.out.println("Seu gato está com " + this.fomeSaciada + " de fome saciada");
	}
	public void darComida() {
	
		if(dormir == true) {
		
			System.out.println("Para alimentar o seu gato você prcisa acorda-lo!");
		}
		else {
			
			System.out.println("Seu gato foi alimentado e recebeu 10 pontos de fome saciada!");
			fomeSaciada += 10;
		}
		
	}
	
	public void dormindo()
	{
			System.out.println("Seu gato está dormindo e recebeu 50 pontos de descanso!");
			descanso += 20;
			
			this.dormir = true;
		
	}
	
	
	public void acordar()
	{
		
			System.out.println("Você acabou de acordar o seu gato e recebeu -5 de descanso!");
			descanso -= 10;	
			this.dormir = false;
		
	}
	
	public void brincar()
	{
		if(dormir == true)
		{
			System.out.println("Seu gato está dormindo! Acordeo para brincar");
		}
		else {
			
			System.out.println("Seu gato está brincando e recebeu 60 pontos de felicidade, menos 10 de fome saciada e menos 20 de descanso!");
			felicidade += 50;
			fomeSaciada -= 10;
			descanso -= 10;
		}
	}

}

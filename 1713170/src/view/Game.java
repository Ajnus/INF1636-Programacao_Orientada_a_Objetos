package view;

public class Game {
	
	private final int LARGURA = 1200;
	private final int ALTURA = 700;

	public Game()
	{
		
		Tela1 tela1 = new Tela1(LARGURA, ALTURA);
		Window window = new Window("BlackJack", LARGURA, ALTURA);
		window.getContentPane().add(tela1);
	}
}

package src;
import java.util.Random;

public class Randon {
	public static void main(String[] Args){
		//Instância o Objeto
		Random Gerador = new Random();
		//Imprime Sequência de 10 Números Inteiros Aleatórios Entre 0 e 25
	    for (int i = 0; i < 10; i++) {
	    System.out.println(Gerador.nextInt(26));
			}
		}
	}
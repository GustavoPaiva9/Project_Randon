package src;
import java.util.Random;

public class Randon {
	public static void main(String[] Args){
		//Inst�ncia o Objeto
		Random Gerador = new Random();
		//Imprime Sequ�ncia de 10 N�meros Inteiros Aleat�rios Entre 0 e 25
	    for (int i = 0; i < 10; i++) {
	    System.out.println(Gerador.nextInt(26));
			}
		}
	}
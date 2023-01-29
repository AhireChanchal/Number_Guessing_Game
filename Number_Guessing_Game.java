import java.util.Random;
import java.util.Scanner;

class GuessNumber_Game{
    public int Number;
    public int InputNumber;
    public int NoOfGuesses = 0;

    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int NoOfGuesses) {
        this.NoOfGuesses = NoOfGuesses;
    }

    GuessNumber_Game(){
        Random rand = new Random();
        this.Number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        NoOfGuesses++;
        if (InputNumber==Number){
            System.out.format("Yes You Guessed it Right, it was %d\nYou guessed it in %d attempts", Number, NoOfGuesses);
            return true;
        }
        else if(InputNumber<Number){
            System.out.println("Too LOW...");
        }
        else if(InputNumber>Number){
            System.out.println("Too HIGH...");
        }
        return false;
    }

}
public class Number_Guessing_Game {
    public static void main(String[] args) {
        GuessNumber_Game g = new GuessNumber_Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }

    }
}

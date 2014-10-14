import TerminalIO.*;
public class GuessMachine {
    private int number;
    private int numGuesses;
    private int guess;
    GuessMachine machine;
       
    KeyboardReader kr = new KeyboardReader();
    
    public GuessMachine(){
        number=(int) (Math.random()*100)+1;
        guess=0;
        numGuesses=0;
    }
    String giveHint(){
        if (guess>number){
            return ("Your guess was too high, please enter another number");}
        
            else if (guess==number){
                    return ("You Got It!");
                    }
        else{
            return ("Your guess was too low, please enter another number");
        }
        
        }
        
    
    String getNumGuesses(){
        int numGuesses=0;
        if (guess>=1 && guess<=100) numGuesses++;
        return (""+numGuesses);
    }
    int setGuess(){
        if (guess>=1 && guess<=100)
            return guess;        
}

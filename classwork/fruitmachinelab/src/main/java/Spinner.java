import java.util.Random;

public class Spinner {

   private Symbol symbol;

   public Symbol getSymbol() {
       return symbol;
   }

   public int getValue() {
       return symbol.getValue();
   }

   public void setRandomSymbol() {
       Random rand = new Random();
       int randomIndex = rand.nextInt(4);
       symbol = Symbol.values()[randomIndex];
   }

}

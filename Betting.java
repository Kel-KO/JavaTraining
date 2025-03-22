import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Betting {
    //holds the bets

    public static List<String> LakersvClippers(String bet, float stake){
        //returns List<String> [W/L, winnings]
        // LakersLine = -110; //-110 favorties
        // ClippersLine = 200; // +200 underdogs
        double spread = 7.5; //+110

        //determine winner
        String[] game = {"Lakers", "Lakers", "Lakers", "Clippers", "Clippers"};
        Random rand = new Random();
        String winner = game[rand.nextInt(game.length)];

        //determine margin of victory
        int margin = rand.nextInt(20) +1;



        if (bet.equals("LakersLine")){
            if (winner.equals("Lakers")){//cashed
                List<String> result = new ArrayList<>();
                //calculate winnings
                float winnings = stake * (100f/110);

                //return your result and your winnings
                result.add("W");
                result.add(Float.toString(winnings + stake));
                return result;

            }
            else{//lost
                List<String> result = new ArrayList<>();
                result.add("L");
                result.add("0");
                return result;
            }
        }
        else if(bet.equals("ClippersLine")){
            if (winner.equals("Clippers")){//cashed
                List<String> result = new ArrayList<>();
                //calculate winnings
                float winnings = stake * (200f/100);

                //return your result and your winnings
                result.add("W");
                result.add(Float.toString(winnings + stake));
                return result;

            }
            else{//lost
                List<String> result = new ArrayList<>();
                result.add("L");
                result.add("0");
                return result;
            }
        }
        else if (bet.equals("LakersSpread")){
            if (winner.equals("Lakers") && margin > spread){//cashed
                List<String> result = new ArrayList<>();
                //calculate winnings
                float winnings = stake * (110f/ 100);

                //return your result and your winnings
                result.add("W");
                result.add(Float.toString(winnings + stake));
                return result;

            }
            else{//lost
                List<String> result = new ArrayList<>();
                result.add("L");
                result.add("0");
                return result;
            }
        }
        else{
            if (winner.equals("Clippers") || margin < spread){ //cashed
                List<String> result = new ArrayList<>();
                //calculate winnings
                float winnings = stake * (110f/ 100);;

                //return your result and your winnings
                result.add("W");
                result.add(Float.toString(winnings + stake));
                return result;

            }
            else{//lost
                List<String> result = new ArrayList<>();
                result.add("L");
                result.add("0");
                return result;
            }
        }

    }
}

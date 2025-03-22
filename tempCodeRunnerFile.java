//simple print statement
//public class tempCodeRunnerFile{
//    public static void main(String[] args){
//        System.out.println("Let's bag this offer");
//    }
//}

//simple function adding integers along with printing
//public class tempCodeRunnerFile{
//    public static void main(String[] args){
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        
//        int answer = x + y + z;
//        System.out.println("x + y + z = " + answer);
//
//    }
//}

//simple function to print elements in a an array and arraylist
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class tempCodeRunnerFile{
//    public static void main(String[] args) {
//
//        String x = "array";
//
//        if (x == "arraylist"){
//        //mutable arraylist
//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < 6; i++){
//            nums.add(i);
//            int len = nums.size();
//            System.out.println("The aray is " + len + " elements long.");
//        }
//        System.out.println(nums);
//    }
//    else if(x == "array"){
//        //immutable array
//        int[] nums = {1,2,3,4,5};
//        System.out.println("The array is " + nums.length + " elements long.");
//        System.out.println(Arrays.toString(nums));
//    }
//
//    }
//}
//simple use of functions

//public class tempCodeRunnerFile{
//    //function to rtake in a number and double it
//    public static int doubleit(Integer num){
//        return num * 2;
//
//    }
//
//    //function to take in a number and and add 50
//    public static int plusfifty(Integer num){
//        return num + 50;
//    }
//
//    public static void main(String[] args){
//        int x = 100;
//        int myint = 100;
//
//        myint = tempCodeRunnerFile.doubleit(myint);
//        myint = tempCodeRunnerFile.plusfifty(myint);
//        myint = tempCodeRunnerFile.doubleit(myint);
//        System.out.println("My original numbger was " + x + ", but, after running my functions, my new number is " + myint);
//
//    }
//}

//simple OOP (Classes and Objects Usage) //using PlayerList.java, Player.java, YouthPlayer.java

//public class tempCodeRunnerFile{
//    public static void main(String[] args) {
//        Player kel = new Player("Kel Onyewuenyi", 26, 95, "CAM");
//        //int KOage = kel.getage();
//        //int KOrating = kel.getrating();
//        //String KOname = kel.getname();
//        //String KOpos = kel.getposition();
//
//        YouthPlayer lucas = new YouthPlayer("u15", "Lucas R.", 13, 52, "RW");
//        YouthPlayer thomas = new YouthPlayer("u13", "Tommy R.", 11, 42, "CM");
//
//        PlayerList players = new PlayerList();
//        players.addPlayer(kel);
//        players.addPlayer(lucas);
//        players.addPlayer(thomas);
//        players.addPlayer("u19", "Marcelo", 19, 88, "ST");
//        players.addPlayer("Johnny Q", 29, 88, "CB");
//
//        players.printPlayerList();
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

////javapracprob
//import java.util.List;
//import java.util.ArrayList;
//public class tempCodeRunnerFile{
//    public static void main(String[] args){
//        javapracprob test = new javapracprob();
//        int[] nums = {1,2,3,4,5,3,6,7,8,9,9};
//        System.out.println(test.findFirstAndLast(nums, 3));
//    }
//}

//SportsBettor calss usage
public class tempCodeRunnerFile{
    public static void main(String[] args) {
        //initialize bettor and set name and balance
        SportsBettor Kel = new SportsBettor("Kel", 10000);
        //get bettors balance
        float kelBalance = Kel.getBalance();

        //bet (make sure the bet is not more than the users balance)
        //get user stakes and bet
        Scanner input = new Scanner(System.in);

        System.out.print("What is your bet? (LakersLine, ClippersLine, LakersSpread, ClippersSpread)");
        String bet = input.nextLine();
        input.nextLine();

        System.out.print("How much will you wager? ");
        float stake = input.nextFloat();
        while(stake > kelBalance){
            System.out.print("Insufficient Funds. How much will you wager? ");
            stake = input.nextFloat();
            input.nextLine();
        }

        //subtract stake from balance and ubdate bettors info
        kelBalance -= stake;
        Kel.updateBalance(kelBalance);

        //place bet by running methods of Bet class

        List<String> result = new ArrayList<>();
        result = Betting.LakersvClippers(bet, stake);
        // get the result of the bet and the earnings or lack of and save to variables
        Character wl = result.get(0).charAt(0);
        Float winnings = Float.parseFloat(result.get(1));

        //print out result and upodate users info then print out new balance
        System.out.println("Your bet result: " + wl + " | Your winings: " + winnings);
        Kel.updateBalance(kelBalance + winnings);
        Kel.updateHistory(wl);
        System.out.println("Account for " + Kel.getName() + " has a balance now of " + Kel.getBalance() + ".");



    }
}
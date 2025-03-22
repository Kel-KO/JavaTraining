import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class javapracprob {
//practice leetcoed style probs
    public String caseSwitcher(String x){
        //use a string builder
        //iterate through string. if letter is uppercase, add lowercase variant to string builder and vice versa
        //return stringbuilder as a string
        //Note: strings are immutable so use String builder
        int len = x.length();
        StringBuilder newstring = new StringBuilder();
        for (int i = 0; i < len; i++){
            if (Character.isLowerCase(x.charAt(i))){
                newstring.append(Character.toUpperCase(x.charAt(i)));
            }
            else{
                newstring.append(Character.toLowerCase(x.charAt(i)));
            }
        }

        return newstring.toString();
    }

    public String Backrev(String s){ //revers back half of string
        //find middle of string. add first half to stgringbuilder. add second half to string builder in reverse

        int len = s.length();
        StringBuilder newstring = new StringBuilder();

        if (len % 2 != 0){   
            for (int i = 0; i <= (int) len/2; i++){
                newstring.append(s.charAt(i));
            }
            for (int i = len - 1; i > (int) len/2; i--){
                newstring.append(s.charAt(i));
            }
        }
        else{
            for (int i = 0; i < (int) len/2; i++){
                newstring.append(s.charAt(i));
            }
            for (int i = len - 1; i >= (int) len/2; i--){
                newstring.append(s.charAt(i));
            } 
        }
        //asdfg
        return newstring.toString();

    }

    public boolean bloomberg(List<String> s, String word){
        //see if there are 2 element in string s that make up the given word x
        //java slicing syntax s.substring(first index, stoping index) excluding stopping index
        //change string list to hashset for O(1) lookup time
        //check each combination of slices of 2 for them in the hash set
        //return true if you find a math and false otherwise

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.size(); i++){ //populate hash set
            set.add(s.get(i));
        }

        //iterate through word slices
        for (int i = 1; i < word.length(); i++){
            StringBuilder firsthalf = new StringBuilder();
            StringBuilder secondhalf = new StringBuilder();
            firsthalf.append(word.substring(0,i));
            secondhalf.append(word.substring(i,word.length()));

            if(set.contains(firsthalf.toString())){
                if (set.contains(secondhalf.toString())){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean ValidAnagram(String s, String t){
        //take in a strings as input.
        // NOTE: remove non alpha chars and make chars lowercase Character.isLetterOrDigit(c)

        //initialize and populate our 2 List<Character>
        List<Character> newS = new ArrayList<>();
        List<Character> newT = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                Character x = Character.toUpperCase(s.charAt(i));
                newS.add(x);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (Character.isLetterOrDigit(t.charAt(i))){
                Character x = Character.toUpperCase(t.charAt(i));
                newT.add(x);
            }
        }


        //check length of string first
        if (newS.size() != newT.size()){
            return false;
        }
        
        //sort newS and newT
        Collections.sort(newS);
        Collections.sort(newT);

        //compare equality by content
        return newS.equals(newT);
    }

    public List<Integer> findFirstAndLast(int[] nums, int num){
        //initialize our resulet array
        List<Integer> res = new ArrayList<>();

        //initialize first and last vaiables for first and last encounters of num (set both -1 initially)
        int first = -1;
        int last = -1;

        //iterate through nums
            //update first and last as necessary

        for (int i = 0; i < nums.length; i++){
            //first instance
            if (first == -1 && nums[i] == num){
                first = i;
            }
            //latest instance
            if (nums[i] == num){
                last = i;
            }
        }

        res.add(first);
        res.add(last);

        return res;
    }

    public int OracleOCIprob(String start, String end){
        //end time is always after start time
        // takes in 2 times of the format 00:00 PM/AM
        //returns the difference in time in minutes

        //take in string and save necessary slices
        String starthrs = start.substring(0,2);
        String startmins = start.substring(3,5);
        String startampm = start.substring(6,8);

        String endhrs = end.substring(0,2);
        String endmins = end.substring(3,5);
        String endampm = end.substring(6,8);

        int startTime = convertToMins(starthrs, startmins, startampm);
        int endTime = convertToMins(endhrs, endmins, endampm);

        return endTime - startTime;
        

    }

    public int convertToMins(String hrs, String mins, String ampm){
        //convert times to minutes since midnight
        //changes pm times to military time
        int hrsint = Integer.parseInt(hrs);
        int minsint = Integer.parseInt(mins);
        if (ampm.equals("PM") && !(hrsint == 12)){
            hrsint += 12;
        }
        if (ampm.equals("AM") && (hrsint == 12)){
            hrsint -= 12;
        }


        return (hrsint * 60) + minsint;
    }

}

import java.util.Scanner;

class userInput{
    public int getUserInput(String prompt){
        System.out.print(prompt+": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
public class simpleguessingGame {
    public static void main(String[] args){
        int noOfGuess=0;
        simpleStartup dot = new simpleStartup();
        userInput input = new userInput();

        
        int random_number = (int) (Math.random()*5);
        
        int[] locations = {random_number,random_number+1,random_number+2};
        dot.setLocations(locations);
        boolean is_alive = true;
        while(is_alive){
            int guess = input.getUserInput("Enter a number");
            String result = dot.checkGame(guess);
            noOfGuess++;
            if(result.equals("kill")){
                is_alive=false;
                System.out.println("You took "+noOfGuess+" guesses");
            }

        }

    }
}

class simpleStartup{
    private int noOfHits;
    private int[] locations;
    
    public String checkGame(int userGuess){
        String result="miss";
        for(int i=0;i<locations.length;i++){
            if(userGuess==locations[i]){
                result = "hit";
                noOfHits++;
                break;
            }
        }
        if(noOfHits==locations.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    public void setLocations(int[] cellLocations){
        locations = cellLocations;
    }
}
import java.util.ArrayList;
import java.util.Random;

public class PuzzlingTest{

    public static void main(String[] args){
        Puzzling generator = new Puzzling();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        

        System.out.println(generator.getRandomLetter()); 

  
        System.out.println(generator.generatePassword());  

        System.out.println(generator.getNewPasswordSet(27));     
        

    }

}
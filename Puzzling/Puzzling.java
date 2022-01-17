import java.util.ArrayList;
import java.util.Random;





public class Puzzling {

    public ArrayList<Integer> getTenRolls() {



        ArrayList<Integer> numran = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 1; i < 11; i++) {
            numran.add(rand.nextInt(20) + 1);
        }

        return numran;
    }


    public String getRandomLetter() {

        Random rand = new Random();

        String abcString = "abcdefghijklmnopqrstuvwxyz";

        char randomChar = abcString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }


    public String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }


        return password;
    }


    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        
        for(int i = 0; i < length; i++) {



            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }

}
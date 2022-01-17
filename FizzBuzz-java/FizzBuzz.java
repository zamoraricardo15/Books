public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        if(number % 3 == 0)
        return "Buzz";
        if(number % 5 == 0)
        return "Fizz";
        if(number % 3 == 0 && number % 5 == 0)
        return "FizzBuzz";
        return Integer.toString(number);
    }
/*    
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(
        // Parameters
        int number,  
        String multOf3Word, 
        String multOf5Word,
        String multOf15Word
        ) {
        
        // Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
    }

*/

}
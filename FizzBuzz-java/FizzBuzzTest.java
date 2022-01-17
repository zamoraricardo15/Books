public class FizzBuzzTest{
    // This will be the launch point for the application
    // For now, we are using this method to test our 
    // FizzBuzz methods
    public static void main(String[] args){
        FizzBuzz tester = new FizzBuzz();
        
        System.out.println(tester.fizzBuzz(9));     // Fizz
        System.out.println(tester.fizzBuzz(10));    // Buzz
        System.out.println(tester.fizzBuzz(15));    // FizzBuzz
        System.out.println(tester.fizzBuzz(16));    // 16
        System.out.println(tester.fizzBuzz(2));     // 2
        
        
    }
    public static void fizzBuzzTest(){
        FizzBuzz tester = new FizzBuzz();
        for(int i = 0; i <= 50; i++){
            String result = tester.fizzBuzz(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }

}
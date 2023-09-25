public class FuzzBuzz {
    public static void main(String[] args) {
        fizzBuzz(105);
    }
    public static void fizzBuzz(int num){
        for (int i = 1; i <100 ; i++) {
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

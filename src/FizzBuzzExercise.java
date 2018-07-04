public class FizzBuzzExercise {
    public void FizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            String temp = "";
            if (i % 3 == 0) {
                temp = "Fizz";
            }
            if (i % 5 == 0) {
                temp += "Buzz";
            }
            System.out.println("".equals(temp) ? i : temp);
        }
    }
}

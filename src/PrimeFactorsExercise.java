import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {

    public List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0){
                int j = 2;
                for(; j < i && i % j != 0; j++);
                if(j == i){
                    list.add(i);
                }
            }
        }
        return list;
    }
}
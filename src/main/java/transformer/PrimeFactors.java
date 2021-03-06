package transformer;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
   public static List<Integer> generate(int i) {
       List<Integer> primeFactors = new ArrayList<>();
       if (i == 2)
           primeFactors.add(2);
       else if (i == 3)
           primeFactors.add(3);
       else if (i == 5)
           primeFactors.add(5);

       if (i == 4) {
           primeFactors.add(2);
           primeFactors.add(2);
       } else if (i == 6) {
           primeFactors.add(2);
           primeFactors.add(3);
       }
       return primeFactors;
    }
}

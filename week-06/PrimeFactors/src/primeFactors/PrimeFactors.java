package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<>();
        int candidate = 2;
        while(n > 1) {
            // a for ciklus elején ;n ---> az inicializáló pozícióban levő értéket kívülről inicializáljuk, lásd itt a generate paraméterében már meg van adva az n. itt annyi minden hiányzik, hogy végtelenedik a for ciklus)
            for(;n % candidate == 0; n /= candidate) {
                primes.add(candidate);
                }
                candidate++;
            }
            return primes;
        }
    }
//        while (n > 1) { // pl. 9-nél: mivel kettővel nem osztható (és hárommal már igen) ezért osztjuk 3-mal egészen addig (While) amíg 1 nem marad - ekkor kilép a loopból, és ahányszor 3-at kapott, azt beteszi az Array Listbe - ezt a megoldást értem :) )
//            while (n % candidate == 0) {
//                primes.add(candidate);
//                n /= candidate;
//            }
//            candidate++;
//        }
//        return primes;
//    }
//}

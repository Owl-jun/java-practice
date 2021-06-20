package jumptojava;

import java.util.Optional;
import java.util.stream.Stream;

public class Gugudan {
    public static void main(String[] args) {
        String Hypen = "-";
        Optional<String> result1 = Stream.generate(()-> Hypen).limit(27).reduce((a, b) -> a + b);
        
        String finalResult;
        finalResult = result1.get();
        System.out.println(finalResult);
        
        for (int i=1;i<=9;i++) {
            for (int k=1;k<=9;k++) {
                System.out.printf("%-3d",i*k);
            }
            System.out.println("");
        }
        System.out.println(finalResult);
    }
}

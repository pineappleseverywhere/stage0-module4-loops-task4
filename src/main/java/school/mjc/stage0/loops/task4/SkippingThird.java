package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int currentNumber = 1;

        while (currentNumber <= lastPrinted) {
            if (currentNumber %3 != 0){
                System.out.println(currentNumber);
            }
            currentNumber++;
             // Skip the next number (3rd)
        }
    }
}

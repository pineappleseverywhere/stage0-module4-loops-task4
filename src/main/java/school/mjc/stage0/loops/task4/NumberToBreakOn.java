package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) { // Use i <= numberToGoUntil for test to pass
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <= toBreakWith; i++) { // Use i < toBreakWith for loop initialization check
                System.out.println(i);
            }
        }
    }
}


package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int variable = 12;
    private final int[] numbers = new int[variable];

    public int getTotal() {
        return total;
    }

    private int total = -1;
    public static final int constant = -1;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == constant;
        }
        
            public boolean isFull() {
                return total == variable-1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return constant;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())

                            return constant;
                        return numbers[total--];
                    }
}

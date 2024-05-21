package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int variable = 12;
    private final int[] NUMBERS = new int[variable];

    public int total = -1;
    public static final int constant = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
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
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return constant;
                        return NUMBERS[total--];
                    }

}

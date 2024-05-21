package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int variable = 12;
    private int[] NUMBERS = new int[variable];

    public int constant = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++constant] = in;
    }

        public boolean callCheck() {
            return constant == -1;
        }
        
            public boolean isFull() {
                return constant == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return constant;
                    return NUMBERS[constant];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return constant;
                        return NUMBERS[constant--];
                    }

}

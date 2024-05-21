package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int variable = 12;
    private int[] NUMBERS = new int[variable];

    public int definedVariable = -1;
    public static final int constant = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++definedVariable] = in;
    }

        public boolean callCheck() {
            return definedVariable == constant;
        }
        
            public boolean isFull() {
                return definedVariable == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return constant;
                    return NUMBERS[definedVariable];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return constant;
                        return NUMBERS[definedVariable--];
                    }

}

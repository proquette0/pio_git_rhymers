package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int getTotal() {
        return total;
    }

    public static final int EMPTY_RHYMER = -1;
    public static final int ERROR_CODE = -1;
    private int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_RHYMER;
        }
        
            public boolean isFull() {
                return total == NUMBERS_SIZE-1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_CODE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR_CODE;
                        return numbers[total--];
                    }
}

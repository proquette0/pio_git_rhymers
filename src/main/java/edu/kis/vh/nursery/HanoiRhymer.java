package edu.kis.vh.nursery;
/**
 * Podklasa klasy defaultCountingOutRhymer, która liczy wartości odrzucone
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * Atrybut liczący odrzucone wartości
     */
	private int totalRejected = 0;
    /**
     * metoda zwracająca ilość odrzuconych wartości
     * @return liczba odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }
  /**
     * metoda, która sprawdza stan tablicy 'NUMBERS' i porównuje wartość argumentu 'in' z ostatnią wartością w tablicy 'NUMBERS'
     * jeśli tablica jest pusta, lub jeśli 'in' jest mniejsze lub równe od ostatniej wartości w tablicy, metoda zwiększa liczbę odrzuconych wartości o jeden
     * w przeciwnym wypadku metoda dodaje wartość argumentu 'in' do tablicy 'NUMBERS'
     * @param in wartość, którą chcemy dodać do stosu
     */
  @Override
    public void countIn(int in) {
    	if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

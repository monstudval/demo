
public class Ex1 {
	private int[] tab;

	public Ex1(int[] tab) {
		this.tab = tab;
	}

	public int getNumPeaks() {

		int numPeaks = 0;
		if (tab.length == 1)
			numPeaks = 1;
		else if (tab.length > 1) {
			if (tab[0] > tab[1])
				numPeaks++;
			if (tab[tab.length - 1] > tab[tab.length - 2])
				numPeaks++;
			for (int i = 1; i < tab.length - 1; i++) {
				if ((tab[i - 1] < tab[i]) && (tab[i] > tab[i + 1]))
					numPeaks++;
			}
		}
		return numPeaks;
	}

}

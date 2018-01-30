
public class Ex2 {
	private String[] tab;

	public Ex2(String[] tab) {
		this.tab = tab;
	}
	
	public Ex2Word[] getTabOcc(){
		
		Ex2Word[] ex2Words = new Ex2Word[tab.length];
		
		for (int i = 0; i < tab.length; i++) {
			// tester si le mot est déja traité
			boolean found = false;
			for (int j = 0; j < ex2Words.length; j++) {
				if(ex2Words[j] == null)
					break;
				if(ex2Words[j].getWord().toLowerCase().equals(tab[i].toLowerCase())){
					found = true;
					break;
				}
			}
			
			//si c'est un nouveau mot à traiter
			if(!found){
				int numOcc = 1;
				Ex2Word ex2Word = new Ex2Word(tab[i], numOcc);
				for (int j = (i+1); j < tab.length; j++) {
					if(tab[j].toLowerCase().equals(ex2Word.getWord().toLowerCase()))
							numOcc++;
				}
				ex2Word.setNumOcc(numOcc);
				ex2Words[i] = ex2Word;
			}
		}
		
		
		return ex2Words;
		
		
	}


}

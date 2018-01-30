
public class Ex2Word {
	private String word;
	private int numOcc;
	public Ex2Word(String word, int numOcc) {
		super();
		this.word = word;
		this.numOcc = numOcc;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getNumOcc() {
		return numOcc;
	}
	public void setNumOcc(int numOcc) {
		this.numOcc = numOcc;
	}
	@Override
	public String toString() {
		return "Ex2Word [word=" + word + ", numOcc=" + numOcc + "]";
	}
	
	

}

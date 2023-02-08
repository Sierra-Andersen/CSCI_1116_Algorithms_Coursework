
public class WordOccurrence implements Comparable<WordOccurrence>{
		
	String word;
	int count;

	WordOccurrence(){
		
	}
	
	WordOccurrence(String word, int count){
		this.word = word;
		this.count = count;
	}
	
	
	@Override 
	public int compareTo(WordOccurrence wordOccur) {

		if(count > wordOccur.count)
			return 1;

		else if(count == wordOccur.count)
			return 0;

		else
			return -1;

	}
	
	@Override
	public String toString() {
		return word + "\t \t" + count;
	}
}


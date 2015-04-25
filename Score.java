class Score implements Cloneable{
	int score;
	String object;
	Score(String a, int b){
		score = b;
		object = a;
	}
	
	@Override 
    public String toString() {
	   return object + " " + score ;
	}
	
	@Override //shallow copy
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	 }
}

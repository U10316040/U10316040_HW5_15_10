import java.util.ArrayList;
class stack implements Cloneable{
	  ArrayList<Score> list = new ArrayList<Score>();
	  //判斷是否為空
	  public boolean isEmpty() {
	    return list.isEmpty();
	  }
    //取得stack的高度
	  public int getSize() {
	    return list.size();
	  }
    //得到(沒移除)stack最上端的物件
	  public Object peek() {
	    return list.get(getSize() - 1);
	  }
    //拿出stack最上端的物件
	  public Object pop() {
	    Object o = list.get(getSize() - 1);
	    list.remove(getSize() - 1);
	    return o;
	  }
    //增加stack的物件
	  public void push(Score o) {
	    list.add(o);
	  }
    /** Override the toString in the Object class */
	  @Override 
	  public String toString() {
	    return "stack: " + list.toString();
	  }
	  
	  @Override
	  public Object clone() throws CloneNotSupportedException {
		stack clone = (stack) super.clone(); //對stack物件淺複製
		clone.list = (ArrayList<Score>)(list.clone()); /*對stack物件裡的list淺複製,此時等於已經對stack物件深複製了
		                                                 ,因為兩stack物件所參考的list位址不同*/
		/*雖然已對stack物件深複製,list位址已經不同,但是list裡面的元素(物件)裡的成員還是只有複製到位址,所以把list裡所有物件進
		  行請複製,如此一來,兩list裡的物件裡的成員位址也不同了*/
		for(int i=0; i<list.size(); i++){
			clone.list.set(i, (Score) list.get(i).clone());
		}
		//已經對list深複製
		return clone;
	 }
}

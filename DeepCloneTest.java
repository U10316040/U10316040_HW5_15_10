public class DeepCloneTest{

	public static void main(String[] args) {
		MyStack myScore = new MyStack();
		myScore.push(new Score("Chinese",100));
		myScore.push(new Score("Math",90));
		myScore.push(new Score("English",80));
		Mystack clone = null;
		try {
			clone = (MyStack) myScore.clone(); //clone 為 myScore 的深複製,如果MyStack的clone沒去做改寫,就只有淺複製
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(myScore.list.toString());
		System.out.println(clone.list.toString());
		System.out.println("---------------------------------------");
		myScore.list.get(0).score = 66; //把myScore的list內第一個元素國文分數從100改成66分
		System.out.println(myScore.list.toString());
		System.out.println(clone.list.toString()); //clone的list內的國文成績沒跟著改
		                                           
		                                           /*如果沒寫在myStack的clone方法沒寫for(int i=0; i<list.size(); i++){
			                                                      clone.list.set(i, (Score) list.get(i).clone());
		                                                      },就只有對list淺複製,所以clone裡的list國文分數會跟著改*/
	}
	
	
}

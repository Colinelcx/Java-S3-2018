public class TestLIFO {
	public static void main(String[] args){
		ListeLIFO lifo= new ListeLIFO();
		lifo.push(14);
		lifo.push(2.0);
		lifo.push("6");
		System.out.println(lifo);
		System.out.println("On dépile " + lifo.pop());
		System.out.println("On dépile " + lifo.pop());
		System.out.println(lifo);
		System.out.println("On dépile " + lifo.pop());
		System.out.println("On dépile " + lifo.pop());

	}
}
import java.util.ArrayList;

public abstract class Liste {
	protected ArrayList<Object> liste;

	public Liste(){
		liste = new ArrayList<Object>();
	}

	public void push(Object o){
		liste.add(o);
	}

	public boolean isEmpty(){
		return liste.size() == 0;
	}

	public int size(){
		return liste.size();
	}

	public abstract Object pop();

	public String toString(){
		String str = "";
		for (Object o: liste){
			str += o.toString() + "\n";
		}
		return str;
	}
}
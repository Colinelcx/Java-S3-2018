import java.util.ArrayList;

public class ListeLIFO extends Liste {
	public Object pop(){
		if (isEmpty()) return null;
		return liste.remove(liste.size()-1);
	}

}
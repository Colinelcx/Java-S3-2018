
public class TestFaune{
  public static void main(String[] args){
    Faune f = new Faune(21);
    System.out.println(f.terrain());
    for (int i=0; i<5; i++){
	    f.etatDeLaFaune();
	    f.udpate();
	    System.out.println(f.terrain());
	}
  }
}
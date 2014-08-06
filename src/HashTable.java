import java.util.Hashtable;
import java.util.TreeSet;
public class HashTable {

	public static void main(String[] args) {
		//heh hash browns... 
		Hashtable<Integer, Integer> browns = new Hashtable<Integer, Integer>();
		//adding the elements to the tree.
		for (int i = 21; i <31; i++)
			browns.put(i, i);
		//heh forest of treesets? 
		TreeSet<Integer> forest = new TreeSet<Integer>(browns.values());
		//printing out elements. 
		for (Integer t : forest)
			System.out.print(t+" ");

	}

}

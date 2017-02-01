import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class SetExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		SetExample o = new SetExample();
		set.add("aa");
		set.add("ab");
		set.add("ac");
		set.add("ad");
		set.add("ae");
		set.add(o);
		System.out.println(set);
		
		
		List list = new LinkedList();
		list.add("aa");
		list.add(o);
		list.add("aa");
		System.out.println(list);
		
	}
	
}

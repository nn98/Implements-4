package G2_201732009;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Iterator;
import java.util.List; 
public class Example2 { 
	static void solution(List<Integer> a) { 
		// ��� a���� 2�� ����� 3�� ����� ��� �����϶� 
		for(Iterator<Integer> i=a.iterator();i.hasNext();) {
			int n=i.next();
			if(n%2==0||n%3==0) i.remove();
		}
	}
	public static void main(String[] args) { 
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7}));
		System.out.println(a.toString()); 
		solution(a); 
		System.out.println(a.toString());
	}
}
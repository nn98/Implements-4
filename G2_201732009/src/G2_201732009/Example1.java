package G2_201732009;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	static int solution(List<Integer> list) { 
		// 목록 a에서 가장 여러 번 등장하는 정수 값을 리턴하라 
		int[] s=new int[10];
		for(Iterator<Integer> i=list.iterator();i.hasNext();) {
			int n=i.next();
			s[n]++;
		}
		int r=-1;
		int c=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i]>c) {
				c=s[i];
				r=i;
			}
		}
		return r;
	} 
	public static void main(String[] args) { 
		List<Integer> a = Arrays.asList(new Integer[] {1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7}); 
		System.out.println(a.toString()); 
		int maxValue = solution(a); 
		System.out.println(maxValue); 
	}
}

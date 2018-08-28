/*
	Hi Brian T!
*/
package study.lambda;

import java.util.Comparator;

public class LambdaExamples {
	public interface MyComparator {
		 public boolean compare(int a1, int a2);
	}
	public static void main(String[] args) {
		MyComparator myComparator = (a1, a2) -> {return a1 > a2;};
		boolean result = myComparator.compare(2, 5);
		System.out.println(result);
//		//Java 7
//		Comparator<String> stringComparator = 
//				new Comparator<String>() { public int compare(String o1, String o2) { return o1.compareTo(o2); } };
//		int comparision = stringComparator.compare("hello", "world");
//		System.out.println(comparision);
//
//		//Java 8: using Lambda Expression
//		Comparator<String> stringComparatorLambda = 
//				(String o1, String o2) -> { return o1.compareTo(o2); };	//This line is Lambda Expression
//		int lambdaComparision = stringComparatorLambda.compare("hello", "world");
//		System.out.println(lambdaComparision);
	}
}
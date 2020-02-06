package yamini.trial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
public class Gifts {
	public static HashMap<String,Integer> sort(HashMap<String,Integer> hm){
		List<Map.Entry<String, Integer>> list=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> arg0,
					Map.Entry<String, Integer> arg1) {
				return (arg0.getValue()).compareTo(arg1.getValue());
			}
		});
		HashMap<String, Integer> temp=new LinkedHashMap<String,Integer>();
		for(Map.Entry<String, Integer> aa:list){
			temp.put(aa.getKey(), aa.getValue());}
		return temp;
	}

	public static void main(String[] args) {
		int candies;
		int sweets;
		System.out.println("enter the number of students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			System.out.println("enter the student name:");
			String name=sc.next();
			s[i].setName(name);
			System.out.println("enter the number of candies:");
			candies=sc.nextInt();
			s[i].setCandies(candies);
			System.out.println("enter the number of sweets:");
			sweets=sc.nextInt();
			s[i].setSweets(sweets);
		}
		HashMap al=new HashMap();
		for(int i=0;i<n;i++)
		{
			al.put(s[i].getName(),new Integer(s[i].getTotalCost()));
		}
		System.out.println("Total cost of gifts per student is as follows:");
		System.out.println(al.entrySet());
		System.out.println("Sorted order according to prices is:");
		Map<String,Integer> hm=sort(al);
		for(Map.Entry<String, Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"="+en.getValue());
		}

	}
}

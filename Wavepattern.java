package kool;
import java.util.Scanner;
import java.util.ArrayList;
public class Wavepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("Enter number of elements for" + "row");
	int m=s.nextInt();
	ArrayList<Integer> column=new ArrayList<>();
	for(int j=0;j<m;j++) {
		column.add(s.nextInt());
	}
	arr.add(column);
}
int k=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<arr.size();j++) {
	System.out.println(arr.get(j).get(i));
}
}

	}

}

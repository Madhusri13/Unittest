import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class solution {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter total numbers");
	/*int k=Integer.valueOf(bf.readLine());
	int[] a=new int[k];
	int c=0;
	for(int i=0;i<k;i++) {
		a[i]=Integer.valueOf(bf.readLine());
		if(a[i]%2==0) {
			c++;
		}
	}*/
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	System.out.println(a.get(0));
	//System.out.println("Odd Number : "+(k-c)+"\nEven Numbers : "+c);
	}

}

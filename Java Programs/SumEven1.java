import java.util.*;
public class SumEven1{
	public static void main(String args[]){
		int number,i,evensum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=sc.nextInt();
		for(i=1;i<=number;i++){
			if(i% 2==0){
				evensum=evensum=evensum+i;
			}
		}
		System.out.println("Sum of Even number upto"+number+"="+evensum);
	}
}	
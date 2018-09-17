package practice;

import java.util.Scanner;
/**
 * Book of Potion making
 * @author POTHURP1
 *
 */
class TestClass {
    public static void main(String args[] ) throws Exception {
       

        //Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("rnter isbn:");
       String isbn=s.nextLine(); 
       String st= validateIsbn(isbn);
       System.out.println(st);

        

    }
    public static String validateIsbn(String isbn) {
    	int num=Integer.parseInt(isbn);
    	int sum=0;
    	if(isbn.length()==10) {
    		for(int i=10;i>0;i--) {
    			int k= num%10;
    			sum += k*i;
    			num=num/10;
    			
    		}
    		System.out.println(sum);
    		if(sum%11==0) {
    			return "Legal ISBN";
    		}
    		else {
    			return "Illegal ISBN";
    		}
    		
    	}
    	else {
    		return "Illegal ISBN";
    	}
    	
    	
    }
}
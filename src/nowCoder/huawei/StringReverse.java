package nowCoder.huawei;

import java.util.Scanner;

/**
 * @author mercy
 *×Ö·û´®µ¹×ª
 */
public class StringReverse {
		 public static String reverseString(String input){
	            String reverse="";
	            for(int i=0;i<input.length();i++){
	                reverse=input.charAt(i)+reverse;
	            }
	            return reverse;
	        }
	    public static void main(String[] args){
	        Scanner in =new Scanner(System.in);
	        while(in.hasNext()){
	            String input=in.nextLine();
	            System.out.println(reverseString(input));
	        }
	    }

}

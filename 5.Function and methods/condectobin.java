import java.util.*;
public class condectobin 
{
    public static void decimaltobinary(int dec){
    int binnum = 0;
    int num = dec;
    int pow = 0;
    while(dec>0){
        int val = dec%2;
        binnum += (val*(int)Math.pow(10,pow));
        dec=dec/2;
        pow++;
    }
    System.out.println("the binary number of: "+num+" is: "+binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
         decimaltobinary(num);
    }
    
}

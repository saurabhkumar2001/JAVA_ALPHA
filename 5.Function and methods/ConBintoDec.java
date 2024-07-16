import java.util.*;
public class ConBintoDec 
{
    public static void binarytodecimal(int binnum){
    int dec = 0;
    int pow = 0;
    int num= binnum;
    while(binnum>0){
        int val =binnum%10;
        dec = dec+(val*(int)Math.pow(2,pow));
        pow++;
        binnum=binnum/10;
    }
    System.out.println("the binary number "+num+" is converted into decimal "+dec); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number in the binary: ");
        int num =sc.nextInt();
         binarytodecimal(num);
    }
    
}

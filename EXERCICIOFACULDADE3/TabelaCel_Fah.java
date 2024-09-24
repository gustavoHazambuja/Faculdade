import java.util.Scanner;
public class TabelaCel_Fah
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        double fahrenheit;
        int num = 0;
        
        do{ 
            fahrenheit = (num*1.8)+32;
            System.out.println(num + " Celsius " + " = " + fahrenheit + " Fahrenhiet ");
            num += 10; //Para somar em 1 em 1 (num ++)//
            
            
    
        }while(num <= 100);
    }
}



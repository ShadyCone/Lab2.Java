import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    
	Scanner n = new Scanner(System.in);    
	int number=0, i=0, f=0;
	
	
	
	System.out.print("Введите целое неотрицательное число n>15: ");
	

	for( ; !n.hasNext("quit"); System.out.print("Введите целое неотрицательное число n>15: ")) {
			if (n.hasNextInt()) {
			    number = n.nextInt();
			    
			    if (number<15 && number>0)
    				{f=1;
    				i=1;
    				while (i<number)
    				    {f += f*i;
    				     i++;   
    				    }
    				System.out.print("Factorial = "+f);    
    			   	break;}
			   	  
			   	else 
    	            {System.out.println("Ошибка ввода. Повторите попытку");
    				}    
			    
			}
	
	        else 
	        {System.out.println("Ошибка ввода. Повторите попытку");
				n.next();}
	
	

        }
    
}
}

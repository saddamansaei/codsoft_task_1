    import java.util.*;
     public class random_no {
	    public static void main(String[] args) {
		
		int min = 1;
		int max = 100;
		int count = 0;
		System.out.println("Random number between "+min+" and "+max);
		int b = (int)(Math.random()*(max-min+1)+min);
		
		//System.out.println("The random number is  :" + b);
		
		System.out.println("You have 3 chance to find the right guess ");
		for(int i=1;i<4;i++) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the "+ i +" number : ");
	    int v = s.nextInt();
		if(v==b) {
			count++;
			System.out.println("Number is match");
		    break;		
		}
		else {
			count++;
			System.out.println("Not match , try again .....");
			
        }
		}
		System.out.println("You attand "+ count+" time to find the currect answer");
		System.out.println("The random number is  :" + b);
		}
        }

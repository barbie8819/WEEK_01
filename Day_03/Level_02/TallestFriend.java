import java.util.Scanner;

public class TallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int youngest= 0,indexAge=0,indexHeight=0;
double tallest= 0;
int[] ages = new int[3];
double[] heights= new double[3];
String[] names= {"Amar" ,"Akbar", "Anthony"};
        System.out.print("\nEnter age of three friends: ");
for (int i=0;i<3;i++)
{
System.out.println("Enter the age of " + names[i]);
ages[i] = scanner.nextInt();
}

        System.out.print("\nEnter height of three friends: ");
for (int i=0;i<3;i++)
{
System.out.println("Enter the height of " + names[i]);

heights[i] = scanner.nextDouble();
}

for (int i=0;i<3;i++)
{
if(ages[i]<youngest){
youngest =ages[i];
indexAge =i;
}
}
for (int i=0;i<3;i++)
{
if(heights[i]>tallest){
tallest =heights[i];
indexHeight= i;
}
}
    
        System.out.println("The youngest friend is: " +names[indexAge]);
        System.out.println("The tallest friend is: " + names[indexHeight]);
    }
}

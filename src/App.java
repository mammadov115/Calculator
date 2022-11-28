import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = input.nextInt();

        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        System.out.println("Select:\n 1-Add (+)\n 2-Sub (-)\n 3-Multiply (*) \n 4-Divide (/) ");
        int operation = input.nextInt();


        // if-else
        // if(operation==1){
        //     System.out.println(n1+" + "+n2+" = "+(n1+n2));
        //     System.out.println("Answer: " + (n1+n2));
        // } else if(operation == 2){
        //     System.out.println(n1+" - "+n2+" = "+(n1-n2));
        //     System.out.println("Answer: " + (n1-n2));
        // } else if(operation == 3){
        //     System.out.println(n1+" * "+n2+" = "+(n1*n2));
        //     System.out.println("Answer: " + (n1*n2));
        // } else if(operation == 4){
        //     System.out.println(n1+" / "+n2+" = "+(n1/n2));
        //     System.out.println("Answer: " + (n1/n2));
        // }            

        // Switch
        switch(operation){
            case 1:
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                System.out.println("Answer: " + (n1+n2));
            case 2:
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                System.out.println("Answer: " + (n1-n2));
            case 3:
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                System.out.println("Answer: " + (n1*n2));
            case 4:
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                System.out.println("Answer: " + (n1/n2));
        }
    }
}

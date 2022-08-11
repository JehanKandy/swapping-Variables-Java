import java.util.Scanner;
class swap {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter int Value of Variable 1 : ");
        int Var1 = numbers.nextInt();
        System.out.println("Enter in Value of Variable 2 : ");   
        int Var2 = numbers.nextInt();

        numbers.close();
        
        //get anther varibale for store Value
        System.out.println("Your 1st Variable is : " + Var1);
        System.out.println("Your 2nd Variable is : " + Var2);
        
        int z = Var1;
        Var1 = Var2;
        Var2 = z;

        System.out.println("------------------ AFTER SWAPING VALUES----------------");
        System.out.println("Your 1st Variable is : " + Var1);
        System.out.println("Your 2nd Variable is : " + Var2);      

    }
}

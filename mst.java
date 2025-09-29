import java.util.Scanner;
public class mst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        int acc_no= sc.nextInt();
        double ini=sc.nextDouble();
        double depo=sc.nextDouble();
        double withdraw=sc.nextDouble();
        if(ini<=0 || depo<=0 || withdraw<=0)
            System.out.println("Invalid input");
        double balance= ini+depo;
        if(withdraw>balance)
            System.out.println("Insufficient balance");
        else{
            balance-=withdraw;
            System.out.println(balance);
        }
    }
}
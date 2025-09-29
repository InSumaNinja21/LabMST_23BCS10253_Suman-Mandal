import java.util.Scanner;
public class mst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double ini,depo,wd,balance;
        String name= sc.nextLine();
        int acc_no= sc.nextInt();
        ini=sc.nextDouble();
        depo=sc.nextDouble();
        wd=sc.nextDouble();
        if(ini<=0 || depo<=0 || wd<=0)
            System.out.println("Invalid input");
        balance= ini+depo;
        if(wd>balance)
            System.out.println("Insufficient balance");
        else{
            balance-=wd;
            System.out.println(balance);
        }
    }
}


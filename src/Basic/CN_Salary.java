package Basic;

import java.util.Scanner;

public class CN_Salary {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int basic=scn.nextInt();
        char grade=scn.next().trim().charAt(0);
        double hra=basic * 0.2;
        double da = basic * 0.5;
        double pf=basic*0.11;

        int allow=0;
        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else if(grade>='C'){
            allow=1300;
        }

        int totalSalary= (int) Math.ceil( basic + hra+da +allow - pf);

        System.out.println(totalSalary);

    }
}

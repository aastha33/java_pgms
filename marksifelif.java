import java.util.*;
public class marksifelif{
	public static void main(String[] args){
		//defining an makrks variable
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your marks in chemistry subject:");
		int chem = sc.nextInt();
                System.out.print("Enter your marks in physics subject:");
		int phy = sc.nextInt();
                System.out.print("Enter your marks in Maths subject:");
		int math = sc.nextInt();
                System.out.print("Enter your marks in english subject:");
		int eng = sc.nextInt();
                System.out.print("Enter your marks in optional subject:");
		int opt = sc.nextInt();
                int total = chem+phy+math+eng+opt;
                System.out.println(total);
                float avg = (float)total/500;
                System.out.println(avg);
                float per = avg*100;
                System.out.println(per);
		//checking the grade
		if((int)per<50) {
			System.out.print("FAIL");
		}
		else if((int)per>=50 && (int)per<60){
			System.out.print("D Grade");
		}
		else if((int)per>=60 && (int)per<70){
			System.out.print("C Grade");
		}
		else if((int)per>=70 && (int)per<80){
			System.out.print("B Grade");
		}
		else if((int)per>=80 && (int)per<90){
			System.out.print("A Grade");
		}
		else if((int)per>=90 && (int)per<100){
			System.out.print("A+ Grade");
		} else {
			System.out.println("Invalid");
	}
}
}
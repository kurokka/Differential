package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+dlib.getDx());
		System.out.println("”÷•ªŒW”‚Æ”’l”÷•ª‚Ì‘Š‘ÎŒë·‚Í"+(100 * Math.abs(dlib.getRx()-dlib.getDx())) / dlib.getRx());
	}
// 8.274037099909037E-6 6.07747097092215E-7 5.054390328496083E-6
//    0.000000001          0.00000001         0.0000001
}

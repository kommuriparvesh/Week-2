package factoryMain;

import java.util.*;

import chalkFactory.FactoryDecision;
import chalkFactory.MakeChalk;
public class MainClass {
	public static void main(String argrs[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Chalk Enterprises");
		while(true) {
			System.out.println("Select your service:\n"
					+ "1.Make Chalk\n"
					+ "2.Make Board\n"
					+ "3.Make Side Walk Board\n"
					+ "4.exit");
			int num=sc.nextInt();
			switch(num) {
			case 1:{
				System.out.println("Select the Factory:\n"
						+ "1.Chalk Factory-1\n"
						+ "2.Chalk Factory-2\n"
						+ "3.Chalk Factory-3\n"
						+ "4.Paru Chalk Factory");
				MakeChalk obj= FactoryDecision.getFactory(sc.nextInt());
				System.out.println("Enter Chalk color");
				obj.makeChalks(sc.next());
				break;
			}
			case 2:{
				System.out.println("Select the Factory:\n"
						+ "1.Chalk Factory-1\n"
						+ "2.Chalk Factory-2\n"
						+ "3.Chalk Factory-3\n"
						+ "4.Paru Chalk Factory");
				MakeChalk obj= FactoryDecision.getFactory(sc.nextInt());
				System.out.println("Enter Board color");
				obj.makeBoard(sc.next());
				break;
			}
			case 3:{
				sc.nextLine();
				System.out.println("Enter SideWalk Board content");
				
				String con=sc.nextLine();
				System.out.println("Select the Factory:\n"
						+ "1.Chalk Factory-1\n"
						+ "2.Chalk Factory-2\n"
						+ "3.Chalk Factory-3\n"
						+ "4.Paru Chalk Factory");
				MakeChalk obj= FactoryDecision.getFactory(sc.nextInt());
				
				obj.makeSideWalkBoard(con);
				break;
			}
			case 4:
				System.out.println("Exiting........");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				break;
				
			
			}
			
			
		}	
	}
}

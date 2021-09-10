package chalkFactory;


public class ParuChalkFactory implements  MakeChalk{

	public void makeChalks(String color) {
		System.out.println("Welcome to Paru Chalk Factory.\nWe are making your color chalks with color:"+color);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" chalks are ready.Please collect from delivery Section");
			 
	}
	public void makeBoard(String color) {
		System.out.println("Welcome to Paru Chalk Factory.\nWe are making your color board with color:"+color);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" board is ready.Please collect from delivery Section");
			
	}
	public void makeSideWalkBoard(String content) {
	System.out.println("Welcome to Paru Chalk Factory.\nWe are making your sidewalk board with given content.\nContent:"+content);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your sidewalk board is ready.Please collect from delivery Section");
			
	}
}

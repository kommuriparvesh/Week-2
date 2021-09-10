package chalkFactory;

public class FactoryDecision {
	public static MakeChalk getFactory(int num) {
		
		switch(num) {
		case 1:
			return new ChalkFactory_1();
		case 2:
			return new ChalkFactory_2();
		case 3:
			return new ChalkFactory_3();
		case 4:
			return new ParuChalkFactory();
		}
		return new ParuChalkFactory();
	}
}

import junit.framework.Test;
import junit.framework.TestSuite;

public class Zarkonnen {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(_B_.class);
		suite.addTestSuite(_B_.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}

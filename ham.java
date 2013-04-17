import junit.framework.Test;
import junit.framework.TestSuite;

public class Ham {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(wrewf.class);
		suite.addTestSuite(qqq.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}

import junit.framework.Test;
import junit.framework.TestSuite;

public class QOMMBOGS {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(AAAA.class);
        suite.addTestSuite(BBBB.class);
        return suite;
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}

package GameUnitTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import GameUnitTests.tests.*;

public class TestRunnerGameWord {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SuiteTestClassTest.class);
        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

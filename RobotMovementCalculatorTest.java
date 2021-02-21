import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RobotMovementCalculatorTest {

    @Test
    public void testPositiveScenario() {
        RobotMovementCalculator calculator = new RobotMovementCalculator();
        long expectedDistance = 3;
        long distance = calculator.calculateDistance("F1,L2,R2,B4");
        assertEquals(expectedDistance, distance);
    }

    @Test
    public void testPositiveScenario2() {
        RobotMovementCalculator calculator = new RobotMovementCalculator();
        long expectedDistance = 5;
        long distance = calculator.calculateDistance("F1,L2,R2,B4,F4,B6");
        assertEquals(expectedDistance, distance);
    }

    @Test
    public void testNagativeScenario() {
        RobotMovementCalculator calculator = new RobotMovementCalculator();
        long expectedDistance = 5;
        long distance = calculator.calculateDistance("F1,L2,R2,B4,F4");
        assertNotEquals(expectedDistance, distance);
    }

    @Test(expected = RuntimeException.class)
    public void testUnknownCommandshouldThrowException() {
        RobotMovementCalculator calculator = new RobotMovementCalculator();
        long distance = calculator.calculateDistance("F1,L2,R2,B4,S4");
    }


}

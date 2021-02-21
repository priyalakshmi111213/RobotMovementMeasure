public class RobotMovementMeasurer {

    public static void main(String[] args) {
        RobotMovementCalculator robotMovementCalculator = new RobotMovementCalculator();
        System.out.printf("Distance to get back : %s%n", robotMovementCalculator.calculateDistance("F1,R1,B2,L1,B3"));
    }

}

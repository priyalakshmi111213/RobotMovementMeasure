import static java.lang.Math.abs;

public class RobotMovementCalculator {


    public long calculateDistance(String commandString) {
        int countForward = 0;
        int countBackward = 0;
        int countLeft = 0;
        int countRight = 0;

        String[] commands =  commandString.split(",");
        for(String command : commands ){
            char movementIndicator= command.charAt(0);
            switch (movementIndicator) {
                case 'F' -> countForward = countForward + Character.getNumericValue(command.charAt(1));
                case 'B' -> countBackward = countBackward + Character.getNumericValue(command.charAt(1));
                case 'L' -> countLeft = countLeft + Character.getNumericValue(command.charAt(1));
                case 'R' -> countRight = countRight + Character.getNumericValue(command.charAt(1));
                default -> throw new RuntimeException("Unknown command " + movementIndicator);
            }
        }
        return abs(countForward - countBackward) + abs(countLeft- countRight);

    }
}

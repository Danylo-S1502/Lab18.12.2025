public class Main {
    public static void main(String[] args) {

        // create simulator object
        TrafficLightSimulator simulator =
                new TrafficLightSimulator(TrafficLightColor.RED);

        // loop limiting number of executions
        for (int i = 0; i < 10; i++) {
            System.out.println(simulator.toString());
            simulator.changeColor(simulator.getCurrentColor());
        }
    }
}

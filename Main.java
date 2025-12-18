public class Main {
    public static void main(String[] args) throws InterruptedException {

        TrafficLightSimulator simulator =
                new TrafficLightSimulator(TrafficLightColor.RED);

        // infinite loop
        while (true) {
            System.out.println(simulator.toString());
            simulator.changeColor(simulator.getCurrentColor());

            // small delay so output is readable
            Thread.sleep(1000);
        }
    }
}}

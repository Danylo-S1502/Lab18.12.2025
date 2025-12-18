class TrafficLightSimulator {

    // a) variable storing current light color
    private TrafficLightColor currentColor;

    // constructor
    public TrafficLightSimulator(TrafficLightColor startColor) {
        this.currentColor = startColor;
    }

    // b) method with switch statement to change color
    public void changeColor(TrafficLightColor color) {
        switch (color) {
            case RED:
                currentColor = TrafficLightColor.GREEN;
                break;
            case GREEN:
                currentColor = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                currentColor = TrafficLightColor.RED;
                break;
        }
    }

    // c) overridden toString() method
    @Override
    public String toString() {
        return "Current traffic light color: " + currentColor;
    }

    // getter for current color
    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }
}

public class ComputerDirector {
    public void constructComputer(ComputerBuilder builder) {
        builder.buildProcessor();
        builder.buildVideoCard();
        builder.buildRam();
        builder.buildStorage();
        builder.buildPowerSupply();
        builder.buildCase();
    }
}
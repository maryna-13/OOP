public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i7");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("NVIDIA RTX 4070");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1 TB SSD");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("750W");
    }

    @Override
    public void buildCase() {
        computer.setCaseType("Gaming RGB Case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
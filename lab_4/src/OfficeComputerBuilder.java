public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i3");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("Integrated Graphics");
    }

    @Override
    public void buildRam() {
        computer.setRam(8);
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512 GB SSD");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("450W");
    }

    @Override
    public void buildCase() {
        computer.setCaseType("Standard Office Case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
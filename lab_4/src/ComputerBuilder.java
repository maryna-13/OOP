public interface ComputerBuilder {
    void buildProcessor();
    void buildVideoCard();
    void buildRam();
    void buildStorage();
    void buildPowerSupply();
    void buildCase();
    Computer getComputer();
}
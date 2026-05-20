public class Computer {
    // характнристики комп'ютера
    private String processor;
    private String videoCard;
    private int ram;
    private String storage;
    private String powerSupply;
    private String caseType;

    // поступове заповнення характеристик
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    // повертає інформації про конфігурацію комп'ютера
    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", ram=" + ram + " GB" +
                ", storage='" + storage + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", caseType='" + caseType + '\'' +
                '}';
    }
}
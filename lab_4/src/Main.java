public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        // ігровий комп'ютер
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.constructComputer(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getComputer();

        System.out.println("Ігровий комп'ютер:");
        System.out.println(gamingComputer);

        // офісний комп'ютер
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.constructComputer(officeBuilder);
        Computer officeComputer = officeBuilder.getComputer();

        System.out.println("\nОфісний комп'ютер:");
        System.out.println(officeComputer);
    }
}
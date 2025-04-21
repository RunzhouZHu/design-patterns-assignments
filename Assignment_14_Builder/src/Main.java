public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        Director director1 = new Director(gamingComputerBuilder);
        Director director2 = new Director(officeComputerBuilder);

        director1.constructComputer();
        Computer computer = gamingComputerBuilder.getComputer();
        System.out.println(computer);
        System.out.println("--------------------");

        director2.construct2RAMComputer();
        Computer computer2 = officeComputerBuilder.getComputer();
        System.out.println(computer2);

    }
}

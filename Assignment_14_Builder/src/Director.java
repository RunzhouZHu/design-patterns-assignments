public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.addProcessor();
        builder.addDisk();
        builder.addGPU();
        builder.addRAM();
        builder.installOS();
    }

    public void construct2RAMComputer() {
        builder.addProcessor();
        builder.addDisk();
        builder.addGPU();
        builder.addRAM();
        builder.addRAM();
        builder.installOS();
    }

}

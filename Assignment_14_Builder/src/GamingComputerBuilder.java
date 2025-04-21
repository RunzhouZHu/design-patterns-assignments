public class GamingComputerBuilder implements ComputerBuilder {

    private final Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void addProcessor() {
        computer.addComponent(new Component("Processor i9"));
    }

    @Override
    public void addRAM() {
        computer.addComponent(new Component("RAM 32G"));
    }

    @Override
    public void addDisk() {
        computer.addComponent(new Component("Disk 512G SSD"));
    }

    @Override
    public void addGPU() {
        computer.addComponent(new Component("GPU Gaming"));
    }

    @Override
    public void installOS() {
        computer.addComponent(new Component("OS windows11"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}

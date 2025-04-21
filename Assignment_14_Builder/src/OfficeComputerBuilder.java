public class OfficeComputerBuilder implements ComputerBuilder {

    private final Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void addProcessor() {
        computer.addComponent(new Component("Processor amd"));
    }

    @Override
    public void addRAM() {
        computer.addComponent(new Component("RAM 16G"));
    }

    @Override
    public void addDisk() {
        computer.addComponent(new Component("Disk 256G SSD"));
    }

    @Override
    public void addGPU() {
        computer.addComponent(new Component("GPU office"));
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

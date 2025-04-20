public interface ComputerBuilder {
    void addProcessor();
    void addRAM();
    void addDisk();
    void addGPU();
    void installOS();
    Computer getComputer();
}

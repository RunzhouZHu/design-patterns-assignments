public class AutomatedProduceLine implements Workshop {
    Workshop produce = new Produce();
    Workshop assemble = new Assemble();

    @Override
    public void work() {
        produce.work();
        assemble.work();
    }
}

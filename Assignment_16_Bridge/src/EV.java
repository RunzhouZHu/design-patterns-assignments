public class EV extends Vehicle {
    public EV(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("EV");
        workshop1.work();
        workshop2.work();
    }
}

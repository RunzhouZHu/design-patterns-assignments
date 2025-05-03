package example;

public class HomeSecuritySystem implements SecuritySystem {

    @Override
    public void activate() {
        System.out.println("Security System activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Security System deactivated");
    }

    @Override
    public void readLog() {
        System.out.println("Reading security log...");
        System.out.println("Log: Security check complete, no issues found.");
    }
}

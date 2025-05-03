package example;

public class SmartHomeApp {
    public static void main(String[] args) {
        Lights myLights = new LivingRoomLights();
        Heating myHeating = new CentralHeating();
        SecuritySystem mySecurity = new HomeSecuritySystem();
        SmartHomeFacade myHome =  new SmartHomeFacade(myLights, myHeating, mySecurity);

        myHome.arriveHome();
        myHome.leaveHome();

        mySecurity.readLog();

    }
}

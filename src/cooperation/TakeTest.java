package cooperation;

public class TakeTest {
    public static void main(String[] args) {
        Sdent sdentJ = new Sdent("Jim", 5000);
        Sdent sdentH = new Sdent("Him", 5500);

        Bus bus100 = new Bus(100);
        Bus bus105 = new Bus(105);

        Subway subGreen = new Subway(1);
        Subway subBlue = new Subway(4);

        sdentH.takeBus(bus100);
        sdentJ.takeSub(subBlue);

        sdentH.showInfo();
        sdentJ.showInfo();

        bus100.showBusInfo();
        bus105.showBusInfo();

        subBlue.showSubwayInfo();

    }
}

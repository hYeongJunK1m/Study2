package cooperation;

public class Sdent {

    String sdentName;
    int grade;
    int money;

    public Sdent(String sdentName, int money){
        this.sdentName = sdentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSub(Subway sub) {
        sub.take(1200);
        this.money -= 1200;
    }
    public void  showInfo(){
        System.out.println(sdentName + "님의 남은 돈은" + money + "원 입니다.");
    }
}

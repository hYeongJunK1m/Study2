package cooperation;

public class Subway {

    int subNumber;
    int passengerCount;
    int money;

    public Subway (int subNumber){
        this.subNumber = subNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showSubwayInfo(){
        System.out.println( subNumber +"번 지하철 승객은 " + passengerCount+ "이고 " + money + "원 입니다.");
    }
}



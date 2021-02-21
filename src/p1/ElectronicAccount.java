package p1;
//#9
public class ElectronicAccount {
    private double kWh;
    private double rate = 0.77;
    private double bill;
    //B
    public void addKWh(double kWh){
        if (kWh > 0){
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
            System.out.println(this.bill);
        }
    }
}

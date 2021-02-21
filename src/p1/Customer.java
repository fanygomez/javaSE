package p1;
//#9
public class Customer {
    ElectronicAccount acct = new ElectronicAccount();
    public void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}

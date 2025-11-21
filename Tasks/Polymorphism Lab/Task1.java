abstract class Package{
   protected String sName;
   protected String rName;
   protected String sAdd;
   protected String rAdd;
   protected double wgtPOunce ;
   protected double costPOunce ;

    public Package() {
        }

    public Package(String sName, String rName, String sAdd, String rAdd, double wgtPOunce, double costPOunce) {
        this.sName = sName;
        this.rName = rName;
        this.sAdd = sAdd;
        this.rAdd = rAdd;
        if (wgtPOunce > 0 && costPOunce > 0) {
            this.wgtPOunce = wgtPOunce;
            this.costPOunce = costPOunce;
        } else {
            System.out.println("Weight and Cost per Ounce can't be Zero!");
        } 
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setsAdd(String sAdd) {
        this.sAdd = sAdd;
    }

    public void setrAdd(String rAdd) {
        this.rAdd = rAdd;
    }

    public void setWgtPOunce(double wgtPOunce) {
        this.wgtPOunce = wgtPOunce;
    }

    public void setCostPOunce(double costPOunce) {
        this.costPOunce = costPOunce;
    }

    public double getWgtPOunce() {
        return wgtPOunce;
    }

    public double getCostPOunce() {
        return costPOunce;
    }

    public String getsName() {
        return sName;
    }

    public String getrName() {
        return rName;
    }

    public String getsAdd() {
        return sAdd;
    }

    public String getrAdd() {
        return rAdd;
    }

    public abstract double calculateCost();

    public String toString() {
        return "Package [costPOunce=" + costPOunce + ", rAdd=" + rAdd + ", rName=" + rName + ", sAdd=" + sAdd + ", sName="
                + sName + ", wgtPOunce=" + wgtPOunce + "]";
    }
}
class TwoDaysPackage extends Package{
    private double flatFee;

    public TwoDaysPackage() {
        super();
        flatFee = 0.0;
    }

    public TwoDaysPackage(String sName, String rName, String sAdd, String rAdd, double wgtPOunce, double costPOunce,
            double flatFee) {
        super(sName, rName, sAdd, rAdd, wgtPOunce, costPOunce);
        this.flatFee = flatFee;
    }

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    public double calculateCost(){
        return (wgtPOunce * costPOunce) + flatFee;
    }

    public String toString() {
        return (super.toString() + "\nTwoDaysPackage [flatFee=" + flatFee + "] " + calculateCost());
    }

}

class OvernightPackage extends Package{
    private double addFee;

    public OvernightPackage() {
        super();
        addFee = 0.0;
    }

    public OvernightPackage(String sName, String rName, String sAdd, String rAdd, double wgtPOunce, double costPOunce,
            double addFee) {
        super(sName, rName, sAdd, rAdd, wgtPOunce, costPOunce);
        this.addFee = addFee;
    }

    public double getAddFee() {
        return addFee;
    }

    public void setAddFee(double addFee) {
        this.addFee = addFee;
    }
    public double calculateCost(){
        return (wgtPOunce * costPOunce) + addFee;
    }
    public String toString() {
        return (super.toString() + "\nOverNightPackage [addFee=" + addFee + "] " + calculateCost());
    }
}

public class Task1{
    public static void main(String[] args){
        Package[] packages = new Package[2];

        packages[0] = new TwoDaysPackage("DD", "Andy", "House", "Andy's House",250.0, 30.0, 350.0);
        packages[1] = new OvernightPackage("JJ", "Hoe", "Room", "Andy's House",250.0, 30.0, 500.0);
        
        for(int i = 0; i < packages.length; i++){
            System.out.println(packages[i]);
        }
    }
}


public class Car {
    Double speed;
    Double posAcc;
    Double negAcc ;
    public void checkPos(){
        if (speed<20 || speed>80 || posAcc<1 || posAcc>3 ||negAcc<1 ||negAcc>3 ){
            System.out.println("The inputted parameters are invalid");
        }
    }
    public  void Position(double speed, double posAcc, double negAcc){
        this.speed= speed*1000/3600;
        this.posAcc=posAcc;
        this.negAcc=negAcc;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getNegAcc() {
        return negAcc;
    }

    public Double getPosAcc() {
        return posAcc;
    }
}

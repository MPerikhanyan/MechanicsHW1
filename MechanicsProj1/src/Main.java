import java.util.*;
public class Main {
    public static void main(){
    }



    public void suggest1(Car car1, Position pos1){
        double sPosAcc = car1.getSpeed()*pos1.getDur() + car1.getPosAcc()* pos1.getDur()*pos1.getDur()/2;
        double tNegAcc = car1.getSpeed()/car1.getNegAcc();
        double sNegAcc = car1.getSpeed()*tNegAcc +car1.getNegAcc()*tNegAcc*tNegAcc/2;
        if(sPosAcc<= pos1.getDist())
            System.out.println("You can accelerate and pass the intersection");

        else if(sNegAcc<= pos1.getDist())
            System.out.println("You can stop if you hit the break");
        else
            System.out.println("You won't manage to pass");
    }
    public void suggest2(Car car1, Car car2, Position position1, double distBetCars){
        double dist1 = position1.getDist();
        double dist2= dist1+ distBetCars;

    }

}

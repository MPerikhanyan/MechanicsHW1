public class Suggest  {


    public int suggest1(Car car1, Position pos1){
        double sPosAcc = car1.getSpeed()*pos1.getDur() + car1.getPosAcc()* pos1.getDur()*pos1.getDur()/2;
        double sNegAcc = car1.getSpeed()*pos1.getDur()  +car1.getNegAcc()*pos1.getDur()* pos1.getDur() /2;
        if(sPosAcc<= pos1.getDist()+pos1.getWidth()){
            System.out.println("You can accelerate and pass the intersection");
             return 1;}
        else if(sNegAcc<= pos1.getDist()) {
            System.out.println("You can stop if you hit the break");
            return -1;
        }
        else
            System.out.println("You won't manage to pass");
        return 0;
    }
    public void suggest2(Car car1, Car car2, Position position1, Position position2, double distBetCars){
      int c1= suggest1(car1,position1);
      int c2 = suggest1(car2, position2);

        if(c2=1 && c1=2){
System.out.println("Both decelearete");
        }

    }
}

public class Position {
    Double dist;
    Double duration;
    Double width;
    public void checkPos(){
        if (dist<10 || dist>150 || duration<2 || duration>5 ||width<5 ||width>20 ){
            System.out.println("The inputted parameters are invalid");
        }
    }
    public  void Position(double distance, double duration, double width){
        this.dist= distance;
        this.duration=duration;
        this.width=width;
    }

    public double getDist(){
        return dist;
    }
    public double getDur(){
        return duration;
    }

    public double getWidth(){
        return width;
    }

}

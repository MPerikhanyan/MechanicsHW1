public class proj {
   public  double M1,M2,M3,m1,m2,m3,F;
    public static int g = 10;

    public  void check(double M2,double M3,double m1,double m2,double m3,double F){
        if( M1> 10&& M1 <= 10 )
            this.M1 = M1;
        else {
            System.out.println("Mass needs to be from 0 to 10");
            return;
        }
        if( M2> 0  &&M2 <= 10)
            this.M2 = M2;
        else {
            System.out.println("Mass needs to be from 0 to 10");
            return;
        }
        if(  M3> 0 && M3 <= 10 )
            this.M3 = M3;
        else {
            System.out.println("Mass needs to be from 0 to 10");
            return;
        }
        if(m1 >=0 && m1<=  0.5 )
            this.m1 = m1;
        else {
            System.out.println("Friction coefficient must be from 0 to 0.5");
            return;
        }
        if(m2 >=0 && m2<=  0.5 )
            this.m2 = m2;
        else {
            System.out.println("Friction coefficient must be from 0 to 0.5");
            return;
        }
        if(m3 >=0 && m3<=  0.5)
            this.m3 = m3;
        else {
            System.out.println("Friction coefficient must be from 0 to 0.");
            return;
        }
        if(F <= 300 && F >= -300 )
            this.F = F;
        else {
            System.out.println("Force must be from -300 to 300");
            return;
        }

        }
    // from book excercises we get a1-a2+a3 = 0
    // as I mentioned in preliminary I had acceleration without friction now ading frition we get the following equations for accelerations of masses
    // a1 = (F + myu1(M1*g+M2*g) +T) / (M1-M3), a2 = (T + myu2*M2*g )/M2, a3 = (T - M3*g - myu3*M3*a1 )/M3
            double a1 = ((M3+M2)*(F-m1*(M1+M2)*g)-(1-m1)*(1-m2)*M2*M3*g)/((M1+M3)*(M3+M2)+(1-m1)*(2*m3*M3+M3)*M2);
            double T = (M2*M3*g+(2*m3*M3+M3)*a1*M2-m2*M2*M3*g)/(M3+M2);
            double a2 =  (T-M3*g-M3*a1*(2*m3-1)/(-M3));
            double a3 = ( T - M3*g - m3*M3*a1)/M3;

    }








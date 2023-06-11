package BAB4_Encapsulation;
public class vehicle1 {
    double load, maxLoad;

    public vehicle1 (double max){
        this.maxLoad = max;
    }
    public vehicle1(int maxInteger){
        this.maxLoad = maxInteger;
    }
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }
        else
        {
            return false;
        }
    }
}
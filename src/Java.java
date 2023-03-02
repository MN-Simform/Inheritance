public class Java extends Language{
    @Override
    public void type(){
        super.type();
        System.out.println("OOP");
    }
    public int calculate(int n1, int n2){
        return n1 + n2;
    }
    public int calculate(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double calculate(double n1, double n2){
        return n1 + n2;
    }
}

public class Triangle {
    public Triangle(){}
    public static boolean checkTriangle(double first,double second,double third){
        if(first>0 && second>0 && third>0) {
            return first + second > third && first + third > second && second + third > first;
        }
        return false;
    }
}

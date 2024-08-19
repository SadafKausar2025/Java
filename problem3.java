package folder.folderl1.folderl2;

class Calculator{
    public void calculate(int a , int b){
        System.out.println("your result is : "+ a+b);
    }
}

class ScCalculator{
    public void calculate(int a , int b){
        System.out.println("your result is : "+ Math.sin(a+b));
    }
}

class HybridCalculator{
    public void calculate(int a , int b){
        System.out.println("your result is : "+ Math.sin(a+b));
        System.out.println("your result is : "+ a+b);
    }
}


public class problem3{
   protected int proInt = 4;
    int defInt = 41;
public static void main(String[] args){
        System.out.println("I am main method");
    }
}
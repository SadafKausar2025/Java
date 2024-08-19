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

class c1 extends problem3{
    void problem3(){
        System.out.println(proInt);
        System.out.println(defInt);
    }
}

public class problem4{
    
    
public static void main(String[] args){
        System.out.println("I am main method");
        c1 c = new c1();
    }
}
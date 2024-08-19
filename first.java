// package codewithsadaf.Second.second;
import codewithsadaf.Second.second;

class Using extends second{
    void meth2(){
     System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
    }
public class first{
    public static void main(String[] args){
        System.out.println("this is the main method of class first ");
        second c = new second();
        Using u = new Using();
        u.meth2();
        System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
    }
}


public class abstraction {
    public static void main(String[] args) {
       chicken c= new chicken();
       c.eat();
       c.walk();
        
       horse h= new horse();
       h.eat();
       h.walk();
       


    }
}
 abstract class animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
 }
 class  horse extends animal{
    void walk (){
        System.out.println("walk on 4 legs");
    }
 }

 class  chicken extends animal{
   void walk() {
        System.out.println("walk on two legs");
    }
 }
 
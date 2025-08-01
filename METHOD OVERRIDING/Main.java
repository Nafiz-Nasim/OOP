

class Massage{

    void print(){
         System.err.println("cats can walk on two legs ");
    }
}


class Cat extends Massage{

  
}
class Fish extends Massage{

    void print(){
        System.err.println("fish can swim");// overriding
    }
}





public class Main {
    
    public static void main(String[] args) {
        Cat cat=new Cat(); 
        Fish fish=new Fish(); 
        cat.print();
        fish.print();
    }
}

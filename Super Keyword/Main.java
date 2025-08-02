class Animal{

String s="hi i am in the animal class";

void print(){
    System.err.println(s);
}


} 
class Cat extends Animal{

    String s="hi i am in the cat class";
    void print(){
        System.err.println(s);
        System.err.println(super.s);
             super.print();//hi i am in the animal class
    }
}







public class Main {
    public static void main(String[] args) {
        
        Cat cat=new Cat();
        cat.print();
            // super.print(); we can not use it here but we can use it in the chiled class 
    }
}

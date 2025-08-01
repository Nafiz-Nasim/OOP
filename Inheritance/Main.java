
 class World{

    void world(){
        System.err.println("the world is alive ");
    }



 }
 
 class Tree extends World{

    void tree(){
        System.err.println(" tree take carbon dioxide ");
    }
 }
 
 
 
 
 
 class Animal extends World {
    boolean is_alive;
    Animal(){
        is_alive=true;
    }
    void take(){
        System.err.println("animal take oxygen");
    }

    
}
 class Dog extends Animal{

    int age=12;
    void Speak()
    {
System.err.println("Ghaoo ghaoo");
    }



}
class Cat extends Animal{
int age= 2;
void Speak(){

    System.err.println("Meow meow");
}

}



 


public class Main {

    public static void main(String[] args) {
       Dog dog= new Dog(); 
       Cat cat= new Cat(); 
       Tree tree=new Tree();
       tree.tree();
       cat.take();
       cat.world();
       System.err.println(dog.is_alive);
       System.err.println(dog.age);
       dog.Speak();

       System.err.println(cat.is_alive);
System.err.println(cat.age);
cat.Speak();

    }
}




class Animal{


 Animal(){

    System.err.println("hi i am in the animal class");
}


} 
class Cat extends Animal{


     Cat(){
        super();
        System.err.println("hi i am from the cat");
    
     }     
}




public class With_constructor {
    public static void main(String[] args) {
          Cat cat=new Cat();  
    }
 
        
}

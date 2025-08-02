abstract class Mama{
      abstract void print(); //abstract method er body part thake na eita k use korar jonno arekta class dara help nia methoed overwrite kore use kora lagbe 
}
class Phelp extends Mama{
    void print(){
        System.err.println("hi i am from the abstract methoed");
    }
}


public class Method {
    public static void main(String[] args) {
      Phelp help=new Phelp();
      help.print();  
    }
}

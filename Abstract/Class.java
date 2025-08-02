
abstract class Name{

    void print(){
        System.err.println("hi i am from the abstract class");
    }
}

class Help extends Name{


}

public class Class {
    public static void main(String[] args) {
Help help=new Help();
        help.print();
    }
    
}

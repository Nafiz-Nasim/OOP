//overloading 2 vabe kora jai 1 jodi chai amra class er moddhe print namer method er parameter shongkha baranor madhome like prothom tai 2ta value nicche 2nd tai 3ta value nicche.

//onno vabe hocche j datatype change korar maddhome 
class Nafiz{
void print(int a,int b)
{
    System.err.println("the sum of the two number is :" + (a+b));
}

void print( int a ,int b,int c)
{
    System.err.println("the sum of the three number is :" + (a+b+c));

 
}
void print( double a ,double b,double c)
{
    System.err.println("the sum of the three number is :" + (a+b+c));

 
}
}





public class Main {
    public static void main(String[] args) {
        Nafiz nafiz=new Nafiz();
        nafiz.print(10, 20);
        nafiz.print(10, 20, 30);
       nafiz.print(10, 10, 10);
    }
}

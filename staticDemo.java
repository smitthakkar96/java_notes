class MyClass{
static int a = 5;
}


class StaticDemo{

public static void main(String args[])
{

    MyClass a = new MyClass();
    MyClass b = new MyClass();

    a.a = 10;

    System.out.println(b.a);
    System.out.println(MyClass.a);    
}
}

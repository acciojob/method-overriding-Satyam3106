public class A {

   String meth() {
       return "Invoking method from class A";
   }

}

class B extends A {

    public static void main(String[] args)
    {
        B obj = new B();
        System.out.println(obj.meth());
    }

    String meth()
    {
        return "method is overriding in extended class B";
    }
}


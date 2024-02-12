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

class C extends A {
       public static void main(String[] args)
    {
        C obj = new C();
        System.out.println(obj.meth());
    }
}
   


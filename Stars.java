class Test{
String n = "";
  //Instance Method
  public void test(String n){ this.n = n;}
}

public class Stars{
  public static void main(String args[]){
      // create an instance of the class
        Test t = new Test();

        // calling an instance method in the class 'Geeks'
        t.test("GeeksforGeeks");
        System.out.println(t.n);
  }
}
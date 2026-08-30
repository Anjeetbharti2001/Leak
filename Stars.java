class ParentClass{
    public boolean isTrue(){
        return true;
    }
}
class ChildClass extends ParentClass{
    public boolean isTrue(){
        boolean parentResult = super.isTrue();

        return !parentResult;
    }
}
public class Stars{
    public static void main(String args[]){
        ChildClass child = new ChildClass();

        boolean result = child.isTrue();

        System.out.println(result);
    }
}
class Res {
    String name;

    // Constructor
    Res(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name : " + name);
    }
    public static void main(String[] args){
        Res s1 = new Res("Anjeet");
        s1.display();
    }
}
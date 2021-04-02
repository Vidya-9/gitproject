abstract class Plants{
    abstract void type();
    void flowers(){
        System.out.println("It is a flowering plant");
    }
}
class Shurbs extends Plants{
    void type(){
        System.out.println("these type of plants are shurbs");
    }

}
 class AbstractExample {
    public static void main(String [] args){
        Plants p= new Shurbs();
        p.flowers();
        p.type();
    }
}

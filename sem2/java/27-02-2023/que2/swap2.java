
class num1{
    int data;
    num1(){

    }
    num1(int a){
        data = a;
    }
    void display(){
        System.out.println(data);
    }
}
public class swap2 {
    static public swapping(num1 obj1, num1 obj2){
        obj1.data = obj1.data + obj2.data;
        obj2.data = obj1.data - obj2.data;
        obj1.data = obj1.data - obj2.data;
    }
    public static void main(String[] args){
        num1 n1 = new num1(5);
        num1 n2 = new num1(10);
        swapping(n1,n2);
        n1.display();
        n2.display();
    }
}

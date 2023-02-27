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
    public static void main(String[] args){
        num1 n1 = new num1(5);
        num1 n2 = new num1(10);
        n1.data = n1.data + n2.data;
        n2.data = n1.data - n2.data;
        n1.data = n1.data - n2.data;
        n1.display();
        n2.display();
    }
}

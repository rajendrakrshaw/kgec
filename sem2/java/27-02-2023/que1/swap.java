
package assingment1;
class num{
	int x,y;
	num(){
			
	}
	num(int a, int b){
            x = a;
            y = b;
	}
	void swapping(){
            x = x + y;
            y = x - y;
            x = x - y;
	}
	void display(){
		System.out.println("X = "+x+" Y = "+y);
	}
}
public class Assingment1{
    
    }
    public static void main(String[] args){
            num n = new num(5,7);
            
            n.display();
            n.swapping();
            n.display();
    }
}
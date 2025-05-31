package ObjectOriented;

class Boss{
 int a;
 int b;


    Boss(int a, int b){
        this.a=a;
        this.b=b;
    }

    void show(){
        System.out.println("Boss data : "+ a+" "+b);

    }

    final void myMethod(){
        System.out.println("Final method");
    }


}

class Employee extends Boss{

    int c;

    Employee(int a, int b, int c) {
        super(a, b);
        this.c= c;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Employee data : "+ c);
    }


}
public class DmoOverride {
    public static void main(String[] args) {
        Employee employee=new Employee(12, 13, 9);
        employee.show();
    }


}

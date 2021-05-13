class Exception1{
    public static void main(String args[]){
    int d ,a;
    try{
        d=0;
        a=40/d;
        System.out.println("This is try block");
     } catch (ArithmeticException e){
            System.out.println("Division by zero is wrong");

        }
        System.out.println("Hey after catch");
    }

}
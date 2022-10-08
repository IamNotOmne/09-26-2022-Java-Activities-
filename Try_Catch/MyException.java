public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

    public String OutOfBound(){
        return "Negative value";
    }

    public String NegaIindex(){
        return "This is negative value";
    }
}
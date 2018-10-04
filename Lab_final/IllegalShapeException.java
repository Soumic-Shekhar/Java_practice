public class IllegalShapeException extends Exception{

    private String msg;

    public IllegalShapeException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }

    public void setMessage(String msg){
        this.msg = msg;
    }

    public void displayErrorMessage(){
        System.out.println(msg);
    }
}
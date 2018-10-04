public class Illigal_Triangle_Exception extends Exception{
    private String msg;

    public Illigal_Triangle_Exception(String msg){
        this.msg = msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg(String msg){
        return msg;
    }

    public void printMassage(){
        System.out.println(msg);
    }


}
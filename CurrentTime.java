public class CurrentTime{
    
    public static void main(String[] arg) {

        long numOfsec = (System.currentTimeMillis()/1000)+(6*60*60);
        //System.out.println(numOfsec);
        long day_sec = numOfsec % (24*60*60);
        //System.out.println(day_sec);

        long hour = (day_sec / 3600);

        //System.out.println(hour);
        day_sec = day_sec % (3600);
        long min = day_sec /60;
        long sec = day_sec % 60;

        System.out.println("time: " + hour + ":" + min + ":" + sec + " BST");
    }



}
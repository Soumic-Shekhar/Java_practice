public class PhoneBook{
    private Contact[] contacts;
    private int index;
    private final int MAX_CONTACT = 20;

    public PhoneBook(){
        contacts = new Contact[20];
        index = 0;
    }

    public void addContact(Contact c){
        if (index <(20-1)){
            index++;
            contacts[index] = c;
        }
    }

    public void viewContact(){
        for (int i = 0; i < index; i++){
            System.out.println(contacts);
        }
    }

    public int searchContact(String name){
        for(int i = 0; i < index; i++){
            if (contacts[i].getName() == name){
                return i;
            }
        }
        return -1;
    }

    public void printByName(){
        // not done
    }

    public void distanceBetweenContact(Contact c1, Contact c2){
        int indexc1 = searchContact(c1.getName());
        int indexc2 = searchContact(c2.getName());

        if(indexc1 != -1 && indexc2 != -1){
            MapLocation addc1 = contacts[indexc1].getAddress();
            MapLocation addc2 = contacts[indexc2].getAddress();
            double distance = addc1.distance(addc2);
            System.out.println("Distace between" + contacts[indexc1] + " & " + contacts[indexc2] + ": " + distance);

        }

        else{
            System.out.println("One or more contacts not found!!!");
        }

    }

}
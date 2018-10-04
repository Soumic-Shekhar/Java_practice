

public class Contact{
    private String name;
    private String phoneNumber;
    private MapLocation address;
    
    public Contact(String name, String phoneNumber, MapLocation address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact(String name, String phoneNumber, double longitude, double latitude){
        this.name = name;
        this.phoneNumber = phoneNumber;
        address.setLongitude(longitude);
        address.setLatitude(latitude);
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }   
    
    public MapLocation getAddress(){
        return address;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(MapLocation address){
        this.address = address;
    }

    public String toString(){
        String s = "Name: " + name + "\n" + "Phone Number: " + phoneNumber + "\n" + "Location: Longitude: " + address.getLongitude() +", Latitude: " +
        address.getLatitude();
        
        return s;
    }

    public double distanceToContact(Contact c){

        return address.distance(c.address);
    }

    public double distanceToContact(Contact c1, Contact c2){
        return c1.address.distance(c2.address);
    }

}

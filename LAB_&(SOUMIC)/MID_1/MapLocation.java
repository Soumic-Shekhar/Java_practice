public class MapLocation{
    private double longitude;
    private double latitude;

    public MapLocation(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    } 

    public double getLatitude(){
        return latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double distance(MapLocation location){
        double ordinate_lon = this.latitude - location.latitude;
        double abcisa_lat = this.longitude - location.longitude;

        return Math.sqrt(Math.pow(abcisa_lat,2) + Math.pow(ordinate_lon,2));
    }

    public double distance(MapLocation location1, MapLocation location2){
        double ordinate_lon = location1.latitude - location2.latitude;
        double abcisa_lat = location1.longitude - location2.longitude;

        return Math.sqrt(Math.pow(abcisa_lat,2) + Math.pow(ordinate_lon,2));
    }

    public String toString(){
        String s = "Location: Longitude = " + longitude + ", latitude =  " + latitude;
        return s;
    }
}
package day26;

import java.util.Comparator;

public class PassengerDetail implements Comparator{
    int id;
    String name;
    String source;
    String Destination;
    String Mode;
    
    public PassengerDetail(int id, String name, String source ,String Destination,String Mode) {
    	this.id = id;
    	this.name = name;
    	this.source = source;
    	this.Destination = Destination;
    	this.Mode =Mode;
    }
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    public void setSource(String source) {
    	this.source = source;
    }
    public String getSource() {
    	return source;
    }
    public void setDestination(String Destination) {
    	this.Destination = Destination;
    }
    public String getDestination() {
    	return Destination;
    }
    public void setMode(String Mode) {
    	this.Mode = Mode;
    }
    public String getMode() {
    	return Mode;
    }
    
    public String toString() {
    	return "ID:"+ id +"  Name:" + name + "  Source:" + source + "   Destination:" + Destination + "  Mode:7" + Mode;
    }

	
	@Override
	public int compare(Object o1, Object o2) {
		PassengerDetail p1 = (PassengerDetail) o1;
        PassengerDetail p2 = (PassengerDetail) o2;

        if (p1.id > p2.id) {
            return 1;
        } else if (p1.id < p2.id) {
            return -1;
        } else {
            return 0;
        }
	
	 }


    
}


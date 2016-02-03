package quest4.Aircraft;

import quest4.Aircraft.contain.*;

public class Aircraft {
    private int id;
    private boolean isFly;
    private String target;
    private Wing[] wings;
    private Engine[] engines;
//    private Chassis chassis;

    public Aircraft(int id){
        this.id = id;
        wings[0] = new Wing(0);
        wings[1] = new Wing(1);
        engines[0] = new Engine(0);
        engines[1] = new Engine(1);
    }
    
    public void fly(){
       isFly = true;
    }
    
    public void setTarget(String t) {
        target = t;
    }
    
    public void printTarget() {
        System.out.println("Target: " + target);
    }
    
    @Override
    public String toString() {
        return getClass().getName() + "@id:" + id;
    }
    
    @Override
    public boolean equals(Object a){
        if(this == a) return true;
        if(a == null) return false;
        if(getClass() != a.getClass()) return false;
        Aircraft other = (Aircraft)a;
        return (other.id == id);
    }

    @Override
    public int hashCode(){
        return id; 
    }
}   





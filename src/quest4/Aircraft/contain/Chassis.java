package quest4.Aircraft.contain;

public class Chassis {
    private int id;
    
    public  Chassis(int id){
        this.id = id;
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
        Chassis other = (Chassis)a;
        return (other.id == id);
    }

    @Override
    public int hashCode(){
        return id; 
    }
}   


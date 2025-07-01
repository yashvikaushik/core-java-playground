package fileInputOutput;

import java.io.Serializable;

public class Address implements Serializable {
    static final long serialVersionUID = 34L;
    
    String street;
    String block;
    Address(String street,String block){
        this.street=street;
        this.block=block;

    }

    public String toString(){
        return "Street: "+street+" Block: "+block;

    }
    
}

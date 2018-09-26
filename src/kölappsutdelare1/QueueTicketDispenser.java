package Kölappsutdelare1;

public class QueueTicketDispenser {
    private int nr;
    private int objectCount;
    
    public QueueTicketDispenser(){
        nr = (objectCount++);
        objectCount++;
    }
    
    public int getNextNumber(){
        return nr++;
    }
    
    
}

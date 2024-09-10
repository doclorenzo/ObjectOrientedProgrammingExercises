package esercizi_oop.basic;

public class ClickCounter {

    private int value;

    public ClickCounter() {
        this.value=0;
    }

    /**
    * Gets the current value  of the counter
     *
     * @return the value of the counter
     */

    public int getValue(){
        return this.value;
    }

    /**
     *Increase by one the value of the counter
     */

    public void click(){
        this.value++;
    }

    /**
     * Decrease by one the value of the counter, only if it is > 0
     */

    public void undo(){
        if(this.value>0) this.value--;
    }

    /**
     * Sets the counter = 0
     */

    public void reset(){
        this.value=0;
    }

}

package Laba3.stuff;

public class Clock extends CommonStuff{
    public Clock() {
        super("часы");
    }

    public int hashCode (){
        return super.hashCode()*23-5*45 ;
    }
    public boolean equals(Flowers c){
        return this.hashCode() == c.hashCode()? true:false;
    }
}

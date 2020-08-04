package Laba3.beast;

import Laba3.Placement;
import Laba3.myException.NamingException;
import Laba3.places.AbstractPlace;
import Laba3.places.Door;
import Laba3.stuff.CommonStuff;
import Laba3.stuff.Tears;

public class Philiphonka extends Beast {

    public Philiphonka() throws NamingException {
        super("Филифьонка");
    }

    public void put(Placement placement, AbstractPlace place, CommonStuff stuff0, CommonStuff stuff1, CommonStuff stuff2){
        System.out.print(this + " поставила " + placement.toString() + place + " " + stuff0.toString() +" , " + stuff1.toString() + " и " +stuff2.toString());
//Она поставила на стол тарелки, три стакана и букет цветов, а на плите стоял кекс, совершенно почерневший от ожидания.
    }

    public void look(Placement placement0, CommonStuff stuff0,CommonStuff stuff1,Placement placement1, AbstractPlace place,CommonStuff stuff2){
        System.out.print(this + " взглягула " + placement0 + stuff0.toString() + " и " + stuff1.toString() + placement1 + place + " , потом посмотрела на себя в " + stuff2.toString() );
//Филифьонка взглянула на часы и гирлянды листьев над дверью, потом посмотрела на себя в зеркало
    }

    public void minstay( Placement placement,AbstractPlace place){
        System.out.print(", оперлась руками " + placement + place + " и" );
        //оперлась руками о стол и заплакала.
    }

    public String cry(){
        return " заплакала.";

    }

    public void find(){
        if (Math.random()<0.4) {
            System.out.print(" (она вертится и ищет вещи.)");
            if (Math.random()<0.4) {
                System.out.print(" (снова вертится и ищет вещи) ");
            }
        }
    }

    public String wasPhiliphonka(){ return "Не всегда легко быть " + this + " ."; }

    public String giveAStart(){ return this + " встрепитнулась, "; }

    public String wipe(Tears atears){ return "вытерла " + atears + " и "; }

    public String open(Door adoor){ return "открыла " + adoor; }

    public String silence(){ return ". Наступило молчание.";}

    public String wrinkled(){ return "Тут лицо " + this + " сморщилось, и она снова"; }

    public String sobbed (){return "всхлипывала она.";}

    public String breathe(){ return "вздыхала"; }

    public String getPropertyBreathe(){ return " тяжело "; }

    public String go(){ return " ходила взад и вперед "; }

    public String sat(){ return "садилась и снова вставала."; }

    public String goTo(){ return "Иногда она подходила к окну и "; }

    public String satDown(){return "В домике сидела " +this +" и слушала,";}

}
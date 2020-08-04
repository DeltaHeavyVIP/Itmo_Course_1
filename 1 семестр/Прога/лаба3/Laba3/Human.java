package Laba3;

import Laba3.places.AbstractPlace;
import Laba3.stuff.CommonStuff;

public class Human {
    private String name;
    private static boolean live;
    private static boolean intelligence;

    public Human (String name){

        this.name=name;
    }
    public void aLive(){
        if (Math.random()<0.05) {
            System.out.print("Прости, но "+ this.name +" умрела от депрессии");
            live = false;}
        else{
            System.out.println("Персонаж "+ this.name + " создан ");
            live = true;
        }
    }
    public static boolean getLive(){
        return live;
    }
    public void aIntelligence(){
        if (Math.random()<0.1){
            System.out.println("Прости, но "+ this.name +" глупа,как и создатель этой проги");
            intelligence = false;}
        else {
            System.out.println(this.name+" очень умная");
            intelligence = true; }
    }
    public boolean getIntelligence(){
        return intelligence; }

        //dto
    public void put(Placement placement, AbstractPlace place, CommonStuff stuff0,CommonStuff stuff1,CommonStuff stuff2){
        System.out.print(this.name + " поставила " + placement.toString() + place + " " + stuff0.toString() +" , " + stuff1.toString() + " и " +stuff2.toString());
//Она поставила на стол тарелки, три стакана и букет цветов, а на плите стоял кекс, совершенно почерневший от ожидания.
    }
    public void look(Placement placement0, CommonStuff stuff0,CommonStuff stuff1,Placement placement1, AbstractPlace place,CommonStuff stuff2){
        System.out.print(this.name + " взглягула " + placement0 + stuff0.toString() + " и " + stuff1.toString() + placement1 + place + " , потом посмотрела на себя в " + stuff2.toString() );
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
                System.out.println(" (снова вертится и ищет вещи) ");
            }
        }
    }
}
package Laba3.beast;


import Laba3.myException.NamingException;

public class Beast {
    private String name;
    private static boolean live;
    private static boolean intelligence;

    public Beast(String name) throws NamingException {
        if (name.length()<2){
            throw new NamingException("Ту-ту, вот и ошибочка подъехала");

        }
        else{ this.name=name;}
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

    public boolean getIntelligence(){ return intelligence; }

    public String toString(){
        return this.name;
    }
}

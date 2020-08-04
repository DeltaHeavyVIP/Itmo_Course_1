package Laba3;

import Laba3.beast.*;
import Laba3.myException.NamingException;
import Laba3.myException.NumberException;
import Laba3.places.*;
import Laba3.stuff.*;
import Laba3.timе.DayTime;
import Laba3.timе.Evening;
import Laba3.timе.Time;

/*Об опасностях, которые грозят в (ночь летнего солнцестояния). (День летнего солнцестояния) был на исходе.
(В половине одиннадцатого вечера) Снусмумрик кончил строить шалаш из еловых веток для своих двадцати четырех малышей.
(В то же самое время) на другом конце леса Муми-тролль и фрекен Снорк замерли на месте, прислушиваясь.
Колокольчик, звеневший в тумане, умолк. Лес спал, а маленький домик печально смотрел на них своими черными окошками.
В домике сидела Филифьонка и слушала, как тикали часы; (время) шло.
Иногда она подходила к окну и вглядывалась в светлую ночь, и тогда колокольчик, украшавший кончик ее колпачка, позвякивал.
Обычно звон колокольчика подбадривал Филифьонку, но нынешним вечером он только усиливал ее тоску.
Она тяжело вздыхала, ходила взад и вперед, садилась и снова вставала.
Она поставила на стол тарелки, три стакана и букет цветов, а на плите стоял кекс, совершенно почерневший от ожидания.
Филифьонка взглянула на часы и гирлянды листьев над дверью, потом посмотрела на себя в зеркало, оперлась руками о стол и заплакала.
Колпачок съехал ей на лоб, так что колокольчик звякнул (всего один печальный звук), и слезы медленно закапали в пустую тарелку.
Не всегда легко быть филифьонкой. И вот тогда кто-то постучал в дверь.
Филифьонка встрепенулась, вытерла слезы и открыла дверь. Наступило молчание.
Фрекен Снорк взглянула на накрытый стол и на гирлянды над дверью.
Тут лицо Филифьонки сморщилось, и она снова расплакалась. — Не будет никакого праздника, — всхлипывала она.
— Пирог сохнет, цветы увядают, время идет, и никто не приходит. Они и в этом году не придут! У них нет никаких родственных чувств!
 */
public class Main {
    public static void main(String[] args) {
        try {
            Philiphonka philiphonka = new Philiphonka();
            philiphonka.aLive();
            Mumitroll mumitroll = new Mumitroll();
            They they = new They();
            Snork snork = new Snork();
            Snusmumrik snusmumrik = new Snusmumrik();
            Table table = new Table();
            Plate plate = new Plate();
            Door door = new Door();
            Snusmumrik.Someone someone = new Snusmumrik.Someone();
            Forest forest = new Forest();
            House house = new House();
            ForeHead foreHead = new ForeHead();
            Dish dish = new Dish(table.getPlacement(), table);
            Glass glass = new Glass(table, table.getPlacement());
            Flowers flowers = new Flowers(table.getPlacement(), table);
            Cake cake = new Cake(plate.getPlacement(), plate, Philiphonka.getLive());
            Clock clock = new Clock();
            Ligths ligths = new Ligths(door, door.getPlacement());
            Mirror mirror = new Mirror();
            Kolokolchik kolokolchik = new Kolokolchik();
            Kolpachok kolpachok = new Kolpachok();
            Hut hut = new Hut();
            Pie pie = new Pie();
            Tears tears = new Tears();
            DayTime dayTime = new DayTime();
            Evening evening = new Evening();
            Evening.Night night = evening.new Night();
            Time time = new Time();
            Celebration celebration = new Celebration();
            Evening anonumus =  new Evening(){
              @Override
              public String yearning(){return ", но нынешним " + this + "ом он только усиливал ее тоску.";}
            };
            System.out.println(night.danger() + night + night.getProperty() + dayTime + dayTime.getProperty() + dayTime.exodus());
            System.out.println(anonumus.getProperty() + evening + "a " + snusmumrik + snusmumrik.endBuild(hut, hut.getProperty(),24));
            System.out.println(time.getProperty() + time + forest.otherSight() + forest + mumitroll + " и " + snork + mumitroll.getProperty());
            System.out.println(kolokolchik.shutOf() + forest + forest.sleep() + house.getProperty() + house + house.look());
            System.out.println(philiphonka.satDown() + clock.tikTak() + time + time.went());
            System.out.println(philiphonka.goTo() + night.look() + kolokolchik.ringingPart0());
            System.out.println(kolokolchik.ringingPart2(philiphonka) + evening.yearning());
            System.out.println(philiphonka + philiphonka.getPropertyBreathe() + philiphonka.breathe() + philiphonka.go() + philiphonka.sat());
            if (philiphonka.getLive() == true) {
                philiphonka.put(table.getPlacement(), table, dish, glass, flowers);
                System.out.println(cake.toString());
                if (philiphonka.getIntelligence() == true) {
                    philiphonka.look(door.getPlacement(), clock, ligths, ligths.getPlacement(), door, mirror);
                } else {
                    philiphonka.find();
                    philiphonka.look(door.getPlacementOn(), clock, ligths, ligths.getPlacement(), door, mirror);
                    philiphonka.find();
                }
                philiphonka.minstay(table.getPlacement(), table);
                System.out.println(philiphonka.cry());
                System.out.print(kolpachok.went(foreHead));
                System.out.print(kolokolchik.ringingPart1());
                while (Tears.inDish() < 7) {
                    System.out.print(tears.toString() + tears.getProperty() + tears.getAction());
                    System.out.print(tears.dropTo(dish));
                }
            } else {
                System.out.println(cake.toString());
            }
            System.out.println("");
            System.out.print(philiphonka.wasPhiliphonka());
            System.out.println(someone.bang(door));
            philiphonka.giveAStart();
            System.out.println( philiphonka.wipe(tears) + philiphonka.open(door) + philiphonka.silence());
            System.out.println(snork.look(table.getPlacement(), table.getProperty(), table, door.getPlacementOn(), ligths, door.getPlacement(), door));
            System.out.print(philiphonka.wrinkled() + philiphonka.cry());
            System.out.println(celebration.willNot() + philiphonka.sobbed());
            System.out.print("-" + pie + pie.getProperty() + flowers + flowers.getProperty() + time + time.go() + they.dontGo());
            System.out.println(they + they.willNotGo() + they.getProperty());
        } catch (NamingException e){
            System.out.println(e.getMessage());
            System.out.println("Hу тут ошибочка в имени");
        } catch (NumberException e){
            System.out.println(e.getMessage());
            System.out.println("Да,да,да, ошибочка в детях");
        }
    }
}
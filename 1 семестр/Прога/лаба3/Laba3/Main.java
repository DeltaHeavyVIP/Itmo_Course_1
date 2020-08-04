package Laba3;

import Laba3.places.*;
import Laba3.stuff.*;

/*Об опасностях, которые грозят в ночь летнего солнцестояния. День летнего солнцестояния был на исходе.
В половине одиннадцатого вечера Снусмумрик кончил строить шалаш из еловых веток для своих двадцати четырех малышей.
В то же самое время на другом конце леса Муми-тролль и фрекен Снорк замерли на месте, прислушиваясь.
Колокольчик, звеневший в тумане, умолк. Лес спал, а маленький домик печально смотрел на них своими черными окошками.
В домике сидела Филифьонка и слушала, как тикали часы; время шло.
Иногда она подходила к окну и вглядывалась в светлую ночь, и тогда колокольчик, украшавший кончик ее колпачка, позвякивал.
Обычно звон колокольчика подбадривал Филифьонку, но нынешним вечером он только усиливал ее тоску.
Она тяжело вздыхала, ходила взад и вперед, садилась и снова вставала. Она поставила на стол тарелки, три стакана и букет цветов, а на плите стоял кекс, совершенно почерневший от ожидания.
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
        Human philiphonka = new Human("Филифьонка");
        philiphonka.aLive();
        Table table = new Table();
        Plate plate = new Plate();
        Door door = new Door();
        ForeHead foreHead = new ForeHead();
        Dish dish = new Dish(table.getPlacement(), table)   ;
        Glass glass = new Glass(table, table.getPlacement());
        Flowers flowers = new Flowers(table.getPlacement(), table);
        Cake cake = new Cake(plate.getPlacement(), plate,Human.getLive());
        Clock clock = new Clock ();
        Ligths ligths = new Ligths(door,door.getPlacement());
        Mirror mirror= new Mirror();
        Kolokolchik kolokolchik =new Kolokolchik();
        Kolpachok kolpachok =new Kolpachok();
        Tears tears =new Tears();
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
            System.out.print(kolokolchik.ringing());
            while (Tears.inDish() < 7) {
                System.out.print(tears.toString() + tears.getProperty() + tears.getAction());
                System.out.print(tears.dropTo(dish));
            }
        }
        else { System.out.println(cake.toString()); }
        }
    }
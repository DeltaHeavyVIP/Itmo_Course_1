package Laba3.timе;

public class Evening extends TimeOfDay implements DayWithProperty {
    public Evening() {
        super("вечер");
    }

    @Override
    public String getProperty() {
        return "В половине одиннадцатого ";
    }

    public String yearning() {
        return "ты не должен это прочитать";
    }

    public class Night {
        public String name = " ночь ";

        public String getProperty() {
            return "летнего солнцестояния. ";
        }

        public String look() {
            return "вглядывалась в светлую" + this;
        }

        public String danger() {
            return "Об опасностях, которые грозят в";
        }

        public String toString() {
            return this.name;
        }

    }
}


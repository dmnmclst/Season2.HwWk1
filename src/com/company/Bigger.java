package com.company;

public class Bigger extends TheBiggest{
    public Bigger(String biggerThan, String smallerThan, OppositeMeaningWords anonymous, MoreInfo detailedInfo) {
        super(biggerThan, smallerThan, anonymous, detailedInfo);
    }

    public final String aboutMe(){
        return "Я хоть и не самый большой, но и не самый маленький";
    }

    public String whoBiggerThanMe(){
        return "Я меньше чем "+getSmallerThan();
    }

    public String iAmBiggerThan(){
        return "Я больше чем "+getBiggerThan();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

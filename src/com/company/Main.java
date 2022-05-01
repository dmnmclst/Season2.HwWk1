package com.company;

public class Main {

    public static void main(String[] args) {
        TheBiggest theBiggest = new TheBiggest("Bigger", "Super Big", OppositeMeaningWords.THE_SMALLEST,
                new MoreInfo(true, "Короче самый, самый...", 1));
        System.out.println();
        System.out.println("+++++++++++++++++++++TheBiggest++++++++++++++++++++++++++++++++++++++");
        System.out.println(theBiggest);
        System.out.println();

        Bigger bigger = new Bigger("Big", "The Biggest", OppositeMeaningWords.SMALLER,
                new MoreInfo(false, "Сравнительное наречия думаю...", 2));
        System.out.println("+++++++++++++++++++++Bigger++++++++++++++++++++++++++++++++++++++");
        System.out.println(bigger);
        System.out.println(bigger.aboutMe());
        System.out.println(bigger.iAmBiggerThan());
        System.out.println(bigger.whoBiggerThanMe());
        System.out.println();

        Big bigA = new Big("bigB", "Bigger", OppositeMeaningWords.SMALL,
                new MoreInfo(false, "Зато не маленький и думая я намного больше чем bigB", 3));
        System.out.println("+++++++++++++++++++++BigA++++++++++++++++++++++++++++++++++++++");
        System.out.println(bigA);
        System.out.println(bigA.iAmBiggerThan());
        System.out.println(bigA.whoBiggerThanMe());
        System.out.println();

        Big bigB = new Big("bigA", "Bigger", OppositeMeaningWords.SMALL,
                new MoreInfo(false, "Зато не маленький и думая я намного больше чем bigA", 3));
        System.out.println("+++++++++++++++++++++BigB++++++++++++++++++++++++++++++++++++++");
        System.out.println(bigB);
        System.out.println(bigB.iAmBiggerThan());
        System.out.println(bigB.whoBiggerThanMe());
    }
}

package com.company;

public final class Big extends Bigger{
    public Big(String biggerThan, String smallerThan, OppositeMeaningWords anonymous, MoreInfo detailedInfo) {
        super(biggerThan, smallerThan, anonymous, detailedInfo);
    }

    @Override
    public String whoBiggerThanMe() {
        return super.whoBiggerThanMe();
    }

    @Override
    public String iAmBiggerThan() {
        return super.iAmBiggerThan();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package com.company;

public class TheBiggest {
    private String biggerThan;
    private String smallerThan;
    private OppositeMeaningWords anonymous;
    private MoreInfo detailedInfo;

    public TheBiggest(String biggerThan, String smallerThan, OppositeMeaningWords anonymous, MoreInfo detailedInfo) {
        this.biggerThan = biggerThan;
        this.smallerThan = smallerThan;
        this.anonymous = anonymous;
        this.detailedInfo = detailedInfo;
    }

    public String getBiggerThan() {
        return biggerThan;
    }

    public String getSmallerThan() {
        return smallerThan;
    }

    public OppositeMeaningWords getAnonymous() {
        return anonymous;
    }

    public MoreInfo getDetailedInfo() {
        return detailedInfo;
    }

    @Override
    public String toString() {
        return "TheBiggest: {" +
                "biggerThan='" + biggerThan + '\'' +
                ", smallerThan='" + smallerThan + '\'' +
                ", anonymous=" + anonymous +
                ", \ndetailedInfo=" + detailedInfo +
                '}';
    }
}

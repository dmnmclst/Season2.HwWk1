package com.company;

public class MoreInfo {
    private final boolean isItTheBiggest;
    private final String description;
    private final int hisHieraticalPosition;

    public MoreInfo(boolean isItTheBiggest, String description, int hisHieraticalPosition) {
        this.isItTheBiggest = isItTheBiggest;
        this.description = description;
        this.hisHieraticalPosition = hisHieraticalPosition;
    }

    public boolean isItTheBiggest() {
        return isItTheBiggest;
    }

    public String getDescription() {
        return description;
    }

    public int getHisHieraticalPosition() {
        return hisHieraticalPosition;
    }

    @Override
    public String toString() {
        return "MoreInfo{" +
                "isItTheBiggest=" + isItTheBiggest +
                ", description='" + description + '\'' +
                ", hisHieraticalPosition=" + hisHieraticalPosition +
                '}';
    }
}

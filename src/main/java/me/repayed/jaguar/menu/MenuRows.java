package me.repayed.jaguar.menu;

public enum MenuRows {
    ONE_ROW(9),
    TWO_ROWS(18),
    THREE_ROWS(27),
    FOUR_ROWS(36),
    FIVE_ROWS(45),
    SIX_ROWS(54);

    private int size;

    MenuRows(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

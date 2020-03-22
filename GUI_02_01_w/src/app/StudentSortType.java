package app;

public enum StudentSortType {
    BYAGE(1, "Name"), BYNAME(3, "Age");

    private final int sortType;
    private final String sortDesc;

    StudentSortType(int sortType, String sortDesc) {
        this.sortType = sortType;
        this.sortDesc = sortDesc;
    }

    public String getSortDesc() {
        return this.sortDesc;
    }
}
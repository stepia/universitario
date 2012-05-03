package user;

public enum Action {
    DELETE("delete"), CREATE("create"), SAVE("save"), CANCEL("cancel"), REFRESH("refresh");

    private String value;

    Action(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Action fromString(String value) {
        if (value != null) {
            for (Action act : Action.values()) {
                if (value.equalsIgnoreCase(act.getValue())) {
                    return act;
                }
            }
        }
        return null;
    }
}

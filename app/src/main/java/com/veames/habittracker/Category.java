package com.veames.habittracker;

public enum Category {

    HEALTH(R.string.health, R.drawable.ic_health),
    SPORT(R.string.sport, R.drawable.ic_sport),
    EDUCATION(R.string.education, R.drawable.ic_education),
    PRODUCTIVITY(R.string.productivity, R.drawable.ic_productivity),
    HOBBY(R.string.hobby, R.drawable.ic_hobby),
    FINANCES(R.string.finances, R.drawable.ic_money),
    SOCIAL(R.string.social, R.drawable.ic_social),
    HOME(R.string.home, R.drawable.ic_home);

    private final int titleResId;
    private final int iconResId;

    Category(int titleResId, int iconResId) {
        this.titleResId = titleResId;
        this.iconResId = iconResId;
    }

    public int getTitleResId() {
        return titleResId;
    }

    public int getIconResId() {
        return iconResId;
    }

}
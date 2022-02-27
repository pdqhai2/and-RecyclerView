package com.example.recyclerview.modle;

public class Character {
    private int resourceId;
    private String charName;

    public Character(int resourceId, String charName) {
        this.resourceId = resourceId;
        this.charName = charName;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}

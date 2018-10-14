package com.wascardev.modpackupdater.api;

import java.util.ArrayList;
import java.util.List;

public class ClientConfig {

    private int ram = 1024;
    private List<String> selectedOptionalMods = new ArrayList<>();
    private boolean forceUpdate = false;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public List<String> getSelectedOptionalMods() {
        return selectedOptionalMods;
    }

    public boolean getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }
}
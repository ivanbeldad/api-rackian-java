package com.rackian.api.domain;

public class SharedPermission {

    private int id;
    private PermissionType type;

    public long getId() {
        return id;
    }

    public PermissionType getType() {
        return type;
    }

    public void setType(PermissionType type) {
        this.type = type;
    }

}

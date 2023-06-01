package com.dsa.generics.school.data;

public abstract class AbstractDataAccessObject<T extends DataTransferObject> {

    public boolean create() {
        return false;
    }

    public boolean delete() {
        return false;
    }

    public boolean put() {
        return false;
    }

    public boolean update() {
        return false;
    }
}

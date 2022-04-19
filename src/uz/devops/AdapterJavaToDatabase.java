package uz.devops;

import uz.devops.base.Database;
import uz.devops.base.JavaApp;

public class AdapterJavaToDatabase extends JavaApp implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}

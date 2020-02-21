package com.es2.singleton;

public class Registry extends Object {
    private static Registry object;
    private String path;
    private String connectionString;

    private Registry() {}

    public static Registry getInstance() {
        if(object == null) object = new Registry();
        return object;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}

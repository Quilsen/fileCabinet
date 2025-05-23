package com.horus;

public class SimpleFolder implements Folder{
    private final String name;
    private final String size;

    SimpleFolder(final String name, final String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "SimpleFolder{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

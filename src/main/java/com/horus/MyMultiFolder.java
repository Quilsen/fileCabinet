package com.horus;

import java.util.List;

public class MyMultiFolder implements MultiFolder{
    private final String name;
    private final String size;
    private final List<Folder> folders;

    MyMultiFolder(final String name, final String size, final List<Folder> folders) {
        this.folders = folders;
        this.name = name;
        this.size = size;
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
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
        return "MyMultiFolder{" +
                "folders=" + folders +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

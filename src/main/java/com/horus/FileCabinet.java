package com.horus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileCabinet implements Cabinet {
    private final List<Folder> folders;

    FileCabinet(final List<Folder> folders) {
        this.folders = folders;
    }

    @Override
    public int count() {
        return getFolders(folders).size();
    }

    @Override
    public Optional<Folder> findFolderByName(final String name) {
        return getFolders(folders).stream()
                .filter(f -> f.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(final String size) {
        return getFolders(folders).stream()
                .filter(f -> f.getSize().equals(size))
                .collect(Collectors.toList());
    }

    public List<Folder> getFolders(List<Folder> folders) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : folders) {
            result.add(folder);
            if (folder instanceof MultiFolder) {
                result.addAll(getFolders(((MultiFolder) folder).getFolders()));
            }
        }
        return result;
    }
}

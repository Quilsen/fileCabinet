package com.horus;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder folder1 = new SimpleFolder("Photos", "LARGE");
        Folder folder2 = new SimpleFolder("Docs", "SMALL");
        Folder folder3 = new SimpleFolder("Music", "MEDIUM");
        Folder folder4 = new SimpleFolder("Videos", "LARGE");

        MultiFolder multiFolder = new MyMultiFolder("Projects", "MEDIUM", List.of(folder2, folder3));
        MultiFolder rootFolder = new MyMultiFolder("Root", "LARGE", List.of(folder1, multiFolder, folder4));

        FileCabinet cabinet = new FileCabinet(List.of(rootFolder));

        System.out.println("Find folder by name 'Music':");
        cabinet.findFolderByName("Music").ifPresent(System.out::println);

        System.out.println("\nFind all folders with size MEDIUM:");
        cabinet.findFoldersBySize("MEDIUM").forEach(System.out::println);

        System.out.println("\nCount all folders:");
        System.out.println(cabinet.count());
    }
}
package composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    private String name;
    private List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystem item) {
        children.add(item);
    }

    public void remove(FileSystem item) {
        children.remove(item);
    }

    @Override
    public void show() {
        System.out.println("Folder: " + name);

        for (FileSystem item : children) {
            item.show();
        }
    }
}
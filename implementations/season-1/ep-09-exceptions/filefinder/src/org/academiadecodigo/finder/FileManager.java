package org.academiadecodigo.finder;

import org.academiadecodigo.finder.exceptions.FileNotFoundException;

/**
 * Created by pantoninho on 22/05/16.
 */
public class FileManager {

    private File[] files;

    public FileManager(int maxFiles) {
        this.files = createFiles(maxFiles);
    }

    private File[] createFiles (int maxFiles) {
        File[] files = new File[maxFiles];

        for (int i = 0; i < files.length; i++) {
            files[i] = new File("File" + i + ".txt");
        }

        return files;
    }

    public File getFile(String filename) throws FileNotFoundException {

        for (File file : files) {

            if (file == null) {
                break;
            }

            if (file.getName().equals(filename)) {
                return file;
            }
        }

        throw new FileNotFoundException();
    }


}

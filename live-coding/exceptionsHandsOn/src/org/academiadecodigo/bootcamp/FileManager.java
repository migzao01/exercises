package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;

public class FileManager {

    private File[] files;

    public FileManager(int numberOfFiles) {
        this.files = createFiles(numberOfFiles);
    }

    private File[] createFiles(int numberOfFiles) {

        File[] files = new File[numberOfFiles];

        for (int i = 0; i < files.length; i++) {
            files[i] = new File("file" + i + ".txt");
        }

        return files;
    }

    public File collectFile(String fileName) throws FileNotFoundException{

        for (File file : files) {
            if(file == null) {
                break;
            }

            if(file.getName().equals(fileName)) {
                return file;
            }
        }

        throw new FileNotFoundException();

    }

}

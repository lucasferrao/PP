package Backend;

import java.io.*;

public class Serialization implements Serializable {
    private final File file;

    public Serialization(String file) {
        this.file = new File(file);
    }

    public File getFile() {
        return file;
    }

    /**
     * Loads/reads the file.
     *
     * @return the deserialized  HiProject
     */
    public HiProject load() {
        try (FileInputStream fileIn = new FileInputStream(file);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (HiProject) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(String.format("There was an error reading the file: %s", ex.getLocalizedMessage()), ex);
        }
    }

    /**
     * Saves the system as a file.
     *
     * @param hiProject serializes the HiProject's class
     */
    public void save(HiProject hiProject) {
        try (FileOutputStream fileOut = new FileOutputStream(file);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            try {
                out.writeObject(hiProject);
            } catch (IOException ex) {
                throw new RuntimeException(String.format("There was an error saving the file: %s", ex.getLocalizedMessage()), ex);
            }
        } catch (IOException ex) {
            throw new RuntimeException(String.format("There was an error saving the file: %s", ex.getLocalizedMessage()), ex);
        }
    }
}
package Week_2;

public class LocalFileMusic implements MusicSource {
	private String fileName;

    public LocalFileMusic(String fileName) {
        this.fileName = fileName;
    }

    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}
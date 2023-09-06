public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(name + " play classic music.");
    }
}

public class PopMusic extends MusicStyles{
    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(name + " play pop music.");
    }
}

public class RockMusic extends MusicStyles{
    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(name + " play rock music.");
    }
}

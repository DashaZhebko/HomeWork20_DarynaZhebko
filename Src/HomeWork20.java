public class HomeWork20 {
    public static void main(String[] args) {
        MusicStyles [] masMusicStyles = new MusicStyles[3];
        masMusicStyles[0] = new ClassicMusic("2Cellos");
        masMusicStyles[1] = new RockMusic("The Beatles");
        masMusicStyles[2] = new PopMusic("Sade");
        
        for (MusicStyles style: masMusicStyles) {
            style.playMusic();
        }
    }
}

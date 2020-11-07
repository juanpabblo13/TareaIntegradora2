package model;

public class Option2 extends Option3 {

    private String[] list;
    private String[] users;
    private String[] pools;
    private String[] playlist;
    private String[] Info;

    public  final int PLAYLIST = 20;
    public final int PV_PLAYLIST = 1;
    public final int SEMIPV_PLAYLIST = 5;


    public Option2(String title, String artist, String duration, String genre, String[] Print) {

        super(title, artist, duration, genre, Print);
    }

    /**
     * name=list
     * @return
     */
    public String[] getList() {
        return list;
    }

    /**
     * name=list
     * @param list
     */
    public void setList(String[] list) {
        this.list = list;
    }

    /**
     * name=users
     * @return
     */
    public String[] getUsers() {
        return users;
    }

    /**
     * name=users
     * @param users
     */
    public void setUsers(String[] users) {
        this.users = users;
    }

    /**
     * name=Pools
     * @return
     */
    public String[] getPools() {
        return pools;
    }

    /**
     * name=Pools
     * @param pools
     */
    public void setPools(String[] pools) {
        this.pools = pools;
    }

    /**
     * name=Playlsit
     * @return
     */
    public String[] getPlaylist() {
        return playlist;
    }

    /**
     * name=Playlist
     * @param playlist
     */
    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    /**
     * name=Info
     * @return
     */
    public String[] getInfo(){
        return Info;
    }

    /**
     * name=Info
     * @param Info
     */
    public void setInfo(String[] Info){
        this.Info = Info;
    }

    /**
     * name=creatorOfAll
     */
    public static void creatorOfAll() {
        System.out.println("*************  User **************\n" +
                "\t\t\t\t**  UserName: lunalunera\n" +
                "\t\t\t\t**  Age: 15\n" +
                "\t\t\t\t**  Category: NEWBIE\n" +
                "\t\t\t\t***********************************\n");
    }

}



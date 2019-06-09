public class Model {
    private String hello;
    private String world;

    public String getPhrase(){
        return hello + " " + world;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}

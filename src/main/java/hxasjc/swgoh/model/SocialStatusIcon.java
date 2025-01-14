package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SocialStatusIcon {
    private int id;
    private String texture;

    public int getId() {
        return id;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return "SocialStatusIcon{" +
                "id=" + id +
                ", texture='" + texture + '\'' +
                '}';
    }
}

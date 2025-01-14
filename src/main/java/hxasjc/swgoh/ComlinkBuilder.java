package hxasjc.swgoh;

import java.net.URL;

public class ComlinkBuilder {
    private URL url;

    public ComlinkBuilder() {}

    public ComlinkBuilder comlinkUrl(URL url) {
        this.url = url;
        return this;
    }

    public Comlink build() {
        return new Comlink(url);
    }
}

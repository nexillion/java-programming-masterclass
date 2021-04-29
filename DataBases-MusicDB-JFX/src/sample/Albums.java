package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Albums
{
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleIntegerProperty artistId;

    public Albums()
    {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
        this.artistId = new SimpleIntegerProperty();
    }

    public int getId()
    {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public int getArtistId() {
        return artistId.get();
    }

    public void setId(int id)
    {
        this.id.set(id);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setArtistId(int artistId) {
        this.artistId.set(artistId);
    }
}
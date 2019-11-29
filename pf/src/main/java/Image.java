import javax.annotation.ManagedBean;

@ManagedBean
public class Image {
    public String path;
    public String description;
    public String title;

    public Image(String path, String description, String title) {
        this.path = path;
        this.description = description;
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

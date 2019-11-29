import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class ImagesView {

    public List<Image> getImages() {
        return images;
    }

    private List<Image> images;
    private String[] descs = {"Zielony mech","1","2","3","1","1","1","1","1","1","1","1","1","1","1"};
    private String[] titles = {"Las","Drzwi","Morze","Lodowiec","Gwiazdy","Góry","1","1","1","1","1","1","1","1","1"};

    public String getMessage() {
        return "Galeria";
    }

    @PostConstruct
    public void init() {
        images = new ArrayList<Image>();
        for (int i = 0; i <= 14; i++) {
            images.add(new Image("image" + i + ".jpg", descs[i], titles[i]));
        }
    }

}
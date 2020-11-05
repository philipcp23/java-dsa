import java.util.ArrayList;
import java.util.List;

public interface Saveable {

    ArrayList<String> write();
    void read(ArrayList<String> savedUsers);
}

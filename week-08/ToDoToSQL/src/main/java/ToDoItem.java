import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by false on 2016. 12. 16..
 */
@DatabaseTable (tableName = "tdlist")
public class ToDoItem {
    @DatabaseField(canBeNull = false)
    private String title;
    private String descr;
    private boolean isComplete;
    private boolean hasDescription;

    public ToDoItem(String rdxrd) {
        this.title = rdxrd;
    }

    public ToDoItem(String title, String descr, boolean isComplete, boolean hasDescription) {
        this.title = title;
        this.descr = descr;
        this.isComplete = isComplete;
        this.hasDescription = hasDescription;

    }

    public ToDoItem() {
    }

    public String toString() {
        return this.title;
    }

    public String getTitle() {
        return title;
    }
}
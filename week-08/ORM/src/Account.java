import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by false on 2016. 12. 14..
 */
@DatabaseTable (tableName = "accounts")

public class Account {
    @DatabaseField(id = true)
    String name;

    @DatabaseField(canBeNull = false)
    String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Account() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +'}';
    }
}

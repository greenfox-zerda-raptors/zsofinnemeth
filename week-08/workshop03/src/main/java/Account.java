import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by false on 2016. 12. 14..
 */
@DatabaseTable
public class Account {
    @DatabaseField(id = true)
    @Getter @Setter
    private String name;
    @DatabaseField
    @Getter @Setter
    private String password;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Address address;

    public Account() {
    }

//    public Account(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }

    public Account(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    @Override
    public String toString() {
        return String.format("{\nname = %s\n%s\n}", name, address.toString());
    }
}
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.query.OrderBy;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.mysql.cj.mysqlx.protobuf.MysqlxCrud;

import java.sql.SQLException;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=root&password=BA71367VZ6kQcz7p&useSSL=false";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);

        Account account2 = new Account("Iron man", "qqqrer.quuu55774");
        createAccountIfNotExists(accountDao, account2);

        Account account3 = new Account("Wolverine", "qsfsdlfl444.fd4");
        createAccountIfNotExists(accountDao, account3);

        Account account4 = new Account("Hulk", "qsnyaaffffd4");
        createAccountIfNotExists(accountDao, account4);

        Account account5 = new Account("Loki", "qefjlsdfj._4.fd4");
        createAccountIfNotExists(accountDao, account5);

        List<Account> accountList = accountDao.queryBuilder()
                .selectColumns("name")
                .orderBy("name", true)
                .query();

        for (Account acc : accountList) {
            System.out.println(acc.getName());
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}
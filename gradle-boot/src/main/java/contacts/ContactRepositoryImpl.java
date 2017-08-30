package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * TODO description
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 20:54
 */

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ContactRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Contact> findAll() {
        return jdbcTemplate.query(
                "select id,user_name,phone_number from contacts order by user_name",
                (rs, rowNum) -> {
                    Contact contact = new Contact();
                    contact.setId(rs.getLong(1));
                    contact.setUserName(rs.getString(2));
                    contact.setPhoneNumber(rs.getString(3));
                    return contact;
                }
        );
    }

    @Override
    public boolean save(Contact contact) {
        jdbcTemplate.update(
                "insert into contacts(user_name,phone_number) values (?,?)",
                contact.getUserName(), contact.getPhoneNumber()
        );

        return true;
    }
}

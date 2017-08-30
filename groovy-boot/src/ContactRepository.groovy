import java.sql.ResultSet

/**
 * 数据仓库
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 21:49
 */

@Grab("h2")

class ContactRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    List<Contact> findAll() {
        jdbcTemplate.query(
                "select id,user_name,phone_number from contacts order by user_name",
                new RowMapper<Contact>() {
                    Contact mapRow(ResultSet rs, int rowNum) {
                        new Contact(id: rs.getLong(1), userName: rs.getString(2), phoneNumber: rs.getString(3))
                    }
                }
        )
    }

    boolean save(Contact contact) {
        jdbcTemplate.update(
                "insert into contacts(user_name,phone_number) values (?,?)",
                contact.getUserName(), contact.getPhoneNumber()
        )
        true

    }

}

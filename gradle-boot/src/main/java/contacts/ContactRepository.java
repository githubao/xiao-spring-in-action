package contacts;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 仓库
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 20:34
 */

public interface ContactRepository {
    List<Contact> findAll();

    boolean save(Contact contact);
}

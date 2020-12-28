package edu.nf.dip;

import edu.nf.dip.impl.StuDaoImpl;
import edu.nf.dip.impl.UserDaoImpl;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class Main {

    public static void main(String[] args) {
        UserDao dao = new StuDaoImpl();
        UserService service = new UserService();
        service.setDao(dao);
        service.add();
    }
}

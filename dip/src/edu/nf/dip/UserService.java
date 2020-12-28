package edu.nf.dip;

import edu.nf.dip.impl.UserDaoImpl;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void add(){
        dao.save();
    }
}

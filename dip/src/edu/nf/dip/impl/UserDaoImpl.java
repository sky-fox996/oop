package edu.nf.dip.impl;

import edu.nf.dip.UserDao;

/**
 * @author wangl
 * @date 2020/11/16
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(){
        System.out.println("insert into user_info values...");
    }
}

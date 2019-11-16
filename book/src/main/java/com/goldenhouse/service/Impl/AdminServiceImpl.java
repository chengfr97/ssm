package com.goldenhouse.service.Impl;

import com.goldenhouse.dao.AdminDao;
import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    @Qualifier("adminDao")
    private AdminDao adminDao;

    //管理员登录，根据查询账号名和密码，登录管理员后台
    @Transactional(propagation = Propagation.REQUIRED,readOnly=true)
    @Override
    public int queryAdmin(Admin admin) {
        return adminDao.queryAdmin(admin);
    }
}

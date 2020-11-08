package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

    //根据用户名查询信息
    public User findByUsername(String username);

    //用户保存
    public void save(User user);

    //根据激活码查找用户对象
    User findByCode(String code);

    //更新状态
    void updateStatus(User user);

    //用户登录
    User findByUsernameAndPassword(String username, String password);
}

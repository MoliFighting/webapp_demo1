package com.wanglei.dao;

import com.wanglei.model.User;
import org.apache.ibatis.annotations.Delete;

/**
 * Created by wanglei on 16/7/28.
 */


public interface IUserDao {
    //该配置方法不需要MAPPER配置文件
    @Delete("delete from user where id = #{id}")
    public void deleteUser(Integer id);
}
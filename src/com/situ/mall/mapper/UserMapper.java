package com.situ.mall.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.situ.mall.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int checkUsername(String username);
	User selectLogin(@Param("username")String username, @Param("password")String password);

	List<User> pageList();
}
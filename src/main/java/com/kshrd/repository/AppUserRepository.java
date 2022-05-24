package com.kshrd.repository;

import com.kshrd.model.AppUser;
import com.kshrd.model.Role;
import com.kshrd.payload.request.AppUserReq;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppUserRepository {

    @Select("INSERT INTO app_user(name, email, password) " +
            "VALUES(#{user.name}, #{user.email}, #{user.password}) RETURNING *")
    @Result(property = "isEnabled", column = "is_enabled")
    @Result(property = "isLocked", column = "is_locked")
    AppUser addNewUser(@Param("user") AppUserReq userReq);

    @Select("SELECT *, id as user_id FROM app_user WHERE email = #{email}")
    @Result(property = "isEnabled", column = "is_enabled")
    @Result(property = "isLocked", column = "is_locked")
    @Result(property = "roles", column = "user_id",
        many = @Many(select = "getAllRoleByUserId")
    )
    AppUser getUserByEmail(String email);

    @Select("SELECT r.id, r.name " +
            "FROM user_role ur " +
            "JOIN role r " +
            "ON ur.role_id = r.id " +
            "WHERE ur.user_id = #{userId}")
    List<Role> getAllRoleByUserId(Integer userId);
}

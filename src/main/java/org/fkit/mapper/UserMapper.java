package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Goods;
import org.fkit.domain.User;

public interface UserMapper {
	
	@Select("select * from tb_user where email = #{email} and password = #{password}")
	User findWithEmailAndPassword(@Param("email")String email,
			@Param("password") String password);
	
	@Insert("insert into tb_user(email,username,password) values (#{email},#{username},#{password})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	int addUser(User user);
	
	@Select("select * from tb_user where username = #{username} and email = #{email}")
	User findPassword(@Param("email")String email,@Param("username")String username);
	
	@Update("update tb_user set password= #{password} where id = #{id}")
	public void updateUser(User user);

}

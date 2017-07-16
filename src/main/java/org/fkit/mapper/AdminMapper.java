package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Admin;

public interface AdminMapper {

	@Select("select * from tb_admin where name = #{name} and password = #{password}")
	Admin findWithNameAndPassword(@Param("name")String name,
			@Param("password") String password);
}

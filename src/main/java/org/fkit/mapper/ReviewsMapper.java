package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Reviews;

public interface ReviewsMapper {

	@Select("select * from tb_reviews where order_id = #{order_id}")
	Reviews findOrderId(Reviews reviews);
	
	@Insert("insert into tb_reviews(content,order_id,logistics,quality,service) values (#{content},#{order_id},#{logistics},#{quality},#{service}) ")
	public void addReviews(Reviews reviews);
	
}

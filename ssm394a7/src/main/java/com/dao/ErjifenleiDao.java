package com.dao;

import com.entity.ErjifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErjifenleiVO;
import com.entity.view.ErjifenleiView;


/**
 * 二级分类
 * 
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface ErjifenleiDao extends BaseMapper<ErjifenleiEntity> {
	
	List<ErjifenleiVO> selectListVO(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
	
	ErjifenleiVO selectVO(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
	
	List<ErjifenleiView> selectListView(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);

	List<ErjifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
	
	ErjifenleiView selectView(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
	
}

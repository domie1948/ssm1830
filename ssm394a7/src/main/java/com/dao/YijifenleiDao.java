package com.dao;

import com.entity.YijifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YijifenleiVO;
import com.entity.view.YijifenleiView;


/**
 * 一级分类
 * 
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface YijifenleiDao extends BaseMapper<YijifenleiEntity> {
	
	List<YijifenleiVO> selectListVO(@Param("ew") Wrapper<YijifenleiEntity> wrapper);
	
	YijifenleiVO selectVO(@Param("ew") Wrapper<YijifenleiEntity> wrapper);
	
	List<YijifenleiView> selectListView(@Param("ew") Wrapper<YijifenleiEntity> wrapper);

	List<YijifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YijifenleiEntity> wrapper);
	
	YijifenleiView selectView(@Param("ew") Wrapper<YijifenleiEntity> wrapper);
	
}

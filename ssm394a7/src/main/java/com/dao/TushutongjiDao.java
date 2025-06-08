package com.dao;

import com.entity.TushutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushutongjiVO;
import com.entity.view.TushutongjiView;


/**
 * 图书统计
 * 
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface TushutongjiDao extends BaseMapper<TushutongjiEntity> {
	
	List<TushutongjiVO> selectListVO(@Param("ew") Wrapper<TushutongjiEntity> wrapper);
	
	TushutongjiVO selectVO(@Param("ew") Wrapper<TushutongjiEntity> wrapper);
	
	List<TushutongjiView> selectListView(@Param("ew") Wrapper<TushutongjiEntity> wrapper);

	List<TushutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<TushutongjiEntity> wrapper);
	
	TushutongjiView selectView(@Param("ew") Wrapper<TushutongjiEntity> wrapper);
	
}

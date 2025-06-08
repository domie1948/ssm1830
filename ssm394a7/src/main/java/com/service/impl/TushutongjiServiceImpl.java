package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TushutongjiDao;
import com.entity.TushutongjiEntity;
import com.service.TushutongjiService;
import com.entity.vo.TushutongjiVO;
import com.entity.view.TushutongjiView;

@Service("tushutongjiService")
public class TushutongjiServiceImpl extends ServiceImpl<TushutongjiDao, TushutongjiEntity> implements TushutongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushutongjiEntity> page = this.selectPage(
                new Query<TushutongjiEntity>(params).getPage(),
                new EntityWrapper<TushutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushutongjiEntity> wrapper) {
		  Page<TushutongjiView> page =new Query<TushutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushutongjiVO> selectListVO(Wrapper<TushutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushutongjiVO selectVO(Wrapper<TushutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushutongjiView> selectListView(Wrapper<TushutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushutongjiView selectView(Wrapper<TushutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

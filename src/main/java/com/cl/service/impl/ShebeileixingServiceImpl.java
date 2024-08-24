package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShebeileixingDao;
import com.cl.entity.ShebeileixingEntity;
import com.cl.service.ShebeileixingService;
import com.cl.entity.view.ShebeileixingView;

@Service("shebeileixingService")
public class ShebeileixingServiceImpl extends ServiceImpl<ShebeileixingDao, ShebeileixingEntity> implements ShebeileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeileixingEntity> page = this.selectPage(
                new Query<ShebeileixingEntity>(params).getPage(),
                new EntityWrapper<ShebeileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeileixingEntity> wrapper) {
		  Page<ShebeileixingView> page =new Query<ShebeileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShebeileixingView> selectListView(Wrapper<ShebeileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeileixingView selectView(Wrapper<ShebeileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.cl.dao.ShebeichukuDao;
import com.cl.entity.ShebeichukuEntity;
import com.cl.service.ShebeichukuService;
import com.cl.entity.view.ShebeichukuView;

@Service("shebeichukuService")
public class ShebeichukuServiceImpl extends ServiceImpl<ShebeichukuDao, ShebeichukuEntity> implements ShebeichukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeichukuEntity> page = this.selectPage(
                new Query<ShebeichukuEntity>(params).getPage(),
                new EntityWrapper<ShebeichukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeichukuEntity> wrapper) {
		  Page<ShebeichukuView> page =new Query<ShebeichukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShebeichukuView> selectListView(Wrapper<ShebeichukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeichukuView selectView(Wrapper<ShebeichukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.cl.dao.ShenqingshebeiDao;
import com.cl.entity.ShenqingshebeiEntity;
import com.cl.service.ShenqingshebeiService;
import com.cl.entity.view.ShenqingshebeiView;

@Service("shenqingshebeiService")
public class ShenqingshebeiServiceImpl extends ServiceImpl<ShenqingshebeiDao, ShenqingshebeiEntity> implements ShenqingshebeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingshebeiEntity> page = this.selectPage(
                new Query<ShenqingshebeiEntity>(params).getPage(),
                new EntityWrapper<ShenqingshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingshebeiEntity> wrapper) {
		  Page<ShenqingshebeiView> page =new Query<ShenqingshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShenqingshebeiView> selectListView(Wrapper<ShenqingshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingshebeiView selectView(Wrapper<ShenqingshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.cl.dao.CangkuguanliyuanDao;
import com.cl.entity.CangkuguanliyuanEntity;
import com.cl.service.CangkuguanliyuanService;
import com.cl.entity.view.CangkuguanliyuanView;

@Service("cangkuguanliyuanService")
public class CangkuguanliyuanServiceImpl extends ServiceImpl<CangkuguanliyuanDao, CangkuguanliyuanEntity> implements CangkuguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangkuguanliyuanEntity> page = this.selectPage(
                new Query<CangkuguanliyuanEntity>(params).getPage(),
                new EntityWrapper<CangkuguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangkuguanliyuanEntity> wrapper) {
		  Page<CangkuguanliyuanView> page =new Query<CangkuguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CangkuguanliyuanView> selectListView(Wrapper<CangkuguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangkuguanliyuanView selectView(Wrapper<CangkuguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

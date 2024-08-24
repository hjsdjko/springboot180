package com.cl.dao;

import com.cl.entity.XinxicaijiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinxicaijiyuanView;


/**
 * 信息采集员
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:43
 */
public interface XinxicaijiyuanDao extends BaseMapper<XinxicaijiyuanEntity> {
	
	List<XinxicaijiyuanView> selectListView(@Param("ew") Wrapper<XinxicaijiyuanEntity> wrapper);

	List<XinxicaijiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XinxicaijiyuanEntity> wrapper);
	
	XinxicaijiyuanView selectView(@Param("ew") Wrapper<XinxicaijiyuanEntity> wrapper);
	

}

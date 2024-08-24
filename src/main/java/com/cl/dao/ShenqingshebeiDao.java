package com.cl.dao;

import com.cl.entity.ShenqingshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShenqingshebeiView;


/**
 * 申请设备
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShenqingshebeiDao extends BaseMapper<ShenqingshebeiEntity> {
	
	List<ShenqingshebeiView> selectListView(@Param("ew") Wrapper<ShenqingshebeiEntity> wrapper);

	List<ShenqingshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingshebeiEntity> wrapper);
	
	ShenqingshebeiView selectView(@Param("ew") Wrapper<ShenqingshebeiEntity> wrapper);
	

}

package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShenqingshebeiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShenqingshebeiView;


/**
 * 申请设备
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShenqingshebeiService extends IService<ShenqingshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingshebeiView> selectListView(Wrapper<ShenqingshebeiEntity> wrapper);
   	
   	ShenqingshebeiView selectView(@Param("ew") Wrapper<ShenqingshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingshebeiEntity> wrapper);
   	

}


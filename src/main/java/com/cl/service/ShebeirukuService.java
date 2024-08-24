package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShebeirukuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeirukuView;


/**
 * 设备入库
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeirukuService extends IService<ShebeirukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeirukuView> selectListView(Wrapper<ShebeirukuEntity> wrapper);
   	
   	ShebeirukuView selectView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeirukuEntity> wrapper);
   	

}


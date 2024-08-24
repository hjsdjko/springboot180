package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShebeichukuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeichukuView;


/**
 * 设备出库
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeichukuService extends IService<ShebeichukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeichukuView> selectListView(Wrapper<ShebeichukuEntity> wrapper);
   	
   	ShebeichukuView selectView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeichukuEntity> wrapper);
   	

}


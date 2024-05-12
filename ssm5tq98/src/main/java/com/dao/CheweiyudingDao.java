package com.dao;

import com.entity.CheweiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweiyudingVO;
import com.entity.view.CheweiyudingView;


/**
 * 车位预定
 * 
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
public interface CheweiyudingDao extends BaseMapper<CheweiyudingEntity> {
	
	List<CheweiyudingVO> selectListVO(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
	
	CheweiyudingVO selectVO(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
	
	List<CheweiyudingView> selectListView(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);

	List<CheweiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
	
	CheweiyudingView selectView(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
	

}

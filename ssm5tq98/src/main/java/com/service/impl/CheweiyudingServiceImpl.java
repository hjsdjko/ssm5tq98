package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CheweiyudingDao;
import com.entity.CheweiyudingEntity;
import com.service.CheweiyudingService;
import com.entity.vo.CheweiyudingVO;
import com.entity.view.CheweiyudingView;

@Service("cheweiyudingService")
public class CheweiyudingServiceImpl extends ServiceImpl<CheweiyudingDao, CheweiyudingEntity> implements CheweiyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweiyudingEntity> page = this.selectPage(
                new Query<CheweiyudingEntity>(params).getPage(),
                new EntityWrapper<CheweiyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweiyudingEntity> wrapper) {
		  Page<CheweiyudingView> page =new Query<CheweiyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweiyudingVO> selectListVO(Wrapper<CheweiyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweiyudingVO selectVO(Wrapper<CheweiyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweiyudingView> selectListView(Wrapper<CheweiyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweiyudingView selectView(Wrapper<CheweiyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Coupon;

public interface CouponService {
	public List<Coupon> findCouponByCid(Coupon c) throws Exception;  //�õ�����starttime>=currentdata��
	public boolean saveCoupon(Coupon c) throws Exception;
	public boolean deleteCoupon(Coupon c) throws Exception;
	public List<Coupon> findCouponByCondition(Coupon c) throws Exception; //�������ں����ɸѡ�Ż�ȯ
}

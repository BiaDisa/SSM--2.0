package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Coupon;;

public interface CouponMapper {
	public List<Coupon> findCouponByCid(Coupon c) throws Exception;  //�õ�����starttime>=currentdata��
	public int saveCoupon(Coupon c) throws Exception;  //�û�ʹ�û��ֻ���Ż�ȯʱ����
	public int deleteCoupon(Coupon c) throws Exception;  //�û�����γ�ʱ����
	public List<Coupon> findCouponByCondition(Coupon c) throws Exception; //�������ں����ɸѡ�Ż�ȯ
	
}

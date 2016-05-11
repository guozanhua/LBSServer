package lbs.business;

import java.util.List;

import lbs.value.CollectValue;
import lbs.value.MyCollectValue;

public interface ICollectBusiness {
	boolean isCollect(int nid, String collectAccount) throws Exception;

	int addCollect(CollectValue cv) throws Exception;
	
	int cancelCollect(CollectValue cv) throws Exception;
	
	List<MyCollectValue> getMyCollectByAccount(String account, int pageNo) throws Exception;
}

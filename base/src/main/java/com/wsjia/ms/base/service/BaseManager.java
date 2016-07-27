package com.wsjia.ms.base.service;



import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ming
 * Date: 12-11-10
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public interface BaseManager {


    Object getObject(String model, String id);

    void saveOrUpdate(String model, Object object);

/*    @Deprecated
    void saveOrUpdate(String doQueryName, HttpServletRequest request) throws Exception;*/



    void delete(String model, String id);

    void remove(String model, String id);

    List listObject(String queryHql, LinkedHashMap<String, Object> queryParamMap);

    @Deprecated
    List listObject(String queryHql, Object... params);



    Object getUniqueObjectByConditions(String queryHql, LinkedHashMap<String, Object> queryParamMap);

    int batchRemove(String model, String[] idArray);

    int batchDelete(String model, String[] idArray);

    void batchSaveOrUpdate(String type, String modelType, List<Object> objectList);

    Object executeSql(String type, String queryStr, LinkedHashMap<String, Object> queryParamMap);


    /***
     * 临时添加测试使用
     * @param object
     */
    @Deprecated
    void saveOrUpdateObject(Object object) ;


    /*
    Object saveOrUpdate(XSaveOrUpdate xSaveOrUpdate) throws Exception;

    List listObject(XQuery xQuery);

    @Deprecated
    PageInfo listPageInfo(String queryHql, PageEntity pageEntity, LinkedHashMap<String, Object> queryParamMap);

    PageInfo listPageInfo(XQuery xQuery);

    Map<Field, List<StatusTypeItem>> listStatusType(String entityName, List<String> fieldNameList);

    Map<Field, List<StatusTypeItem>> listStatusType(String entityName, String[] fieldNameList);

    List<StatusTypeItem> listStatusType(String entityName, String fieldName);

*/

}

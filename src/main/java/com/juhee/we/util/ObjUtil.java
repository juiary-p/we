package com.juhee.we.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * 형변환 Util
 */
public class ObjUtil {

    /**
     * Request > Map 형변환
     * @param req
     * @return
     * @throws IllegalArgumentException
     */
    public synchronized static HashMap<String, Object> convertRequestToMap(HttpServletRequest req)
        throws IllegalArgumentException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Enumeration<String> en = req.getParameterNames();

        while(en.hasMoreElements()){
            String key = (String) en.nextElement();
            String value = StrUtil.nvl(req.getParameter(key));

            map.put(key, value);
        }

        return map;
    }
}

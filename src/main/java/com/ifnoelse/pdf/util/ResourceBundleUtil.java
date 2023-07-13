package com.ifnoelse.pdf.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author xyzha
 * @date 2023/7/13 6:45
 */
@Slf4j
public class ResourceBundleUtil {
    private static final ResourceBundle RESOURCE_BUNDLE ;

    static {
        RESOURCE_BUNDLE = ResourceBundle.getBundle("bookMark", Locale.getDefault());
    }
    public static String getResourceWithKey(String key) {
        log.debug("中文getResourceWithKey:{}",RESOURCE_BUNDLE.keySet());
        log.debug("get Resource:{}",RESOURCE_BUNDLE.getString("gui.file"));
        try {
         return   RESOURCE_BUNDLE.getString(key);
        } catch (Exception e) {
            log.error("get resource:{} exception",key,e);
        }
        return "";
    }
}

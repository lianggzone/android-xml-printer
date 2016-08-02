package com.lianggzone;


import org.junit.Test;

import com.lianggzone.model.AndroidInfoModel;

/**
 * AXMLPrinterTest
 * @author lianggzone
 * @since 
 * <p>更新时间: 2016年8月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class AXMLPrinterTest {

    @Test
    public void test() {
        AndroidInfoModel androidInfoModel = AndroidXMLPrinter.getInfo("J:/dev-repo/git-repo/android-xml-printer/src/test/resources/AndroidManifest.xml");
        System.out.println(androidInfoModel.getPackageName());
        System.out.println(androidInfoModel.getVersionCode());
        System.out.println(androidInfoModel.getVersionName());
    }
}
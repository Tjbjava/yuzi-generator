package com.yupi.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-14  10:36
 * @Description: TODO
 * @Version: 1.0
 */
public class MetaManager {

    private static volatile Meta meta;

    public static Meta getMetaObject() {
        if (meta == null) {
            synchronized (MetaManager.class) {
                if(meta == null) {
                    meta = initMeta();
                }
            }
        }
        return meta;
    }

    private static Meta initMeta() {
        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
        // todo 校验配置文件，处理默认值
        return newMeta;
    }

}

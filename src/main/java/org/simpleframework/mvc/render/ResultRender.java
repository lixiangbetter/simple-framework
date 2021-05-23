package org.simpleframework.mvc.render;

import org.simpleframework.mvc.RequestProcessorChain;

/**
 * 渲染请求结果
 * @author lx
 * @date 2021/5/22 10:39 上午
 */
public interface ResultRender {
    void render(RequestProcessorChain requestProcessorChain) throws Exception;
}

package org.simpleframework.mvc.processor;

import org.simpleframework.mvc.RequestProcessorChain;

/**
 * 请求执行器
 * @author lx
 * @date 2021/5/22 9:54 上午
 */
public interface RequestProcessor {
    boolean process(RequestProcessorChain requestProcessorChain) throws Exception;
}

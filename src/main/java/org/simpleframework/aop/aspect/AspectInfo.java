package org.simpleframework.aop.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.simpleframework.aop.PointcutLocator;

/**
 * @author lx
 * @date 2021/5/21 11:50 上午
 */
@AllArgsConstructor
@Getter
public class AspectInfo {
    private int orderIndex;
    private DefaultAspect aspectObject;
    private PointcutLocator pointcutLocator;

    public AspectInfo(int value, DefaultAspect aspect) {
        this.orderIndex = value;
        this.aspectObject = aspect;
    }
}

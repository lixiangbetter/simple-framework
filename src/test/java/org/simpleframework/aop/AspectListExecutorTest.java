package org.simpleframework.aop;

import org.junit.jupiter.api.Test;
import org.simpleframework.aop.aspect.AspectInfo;
import org.simpleframework.aop.mock.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lx
 * @date 2021/5/21 11:55 上午
 */
public class AspectListExecutorTest {

    @Test
    public void sortTest() {
        ArrayList<AspectInfo> aspectInfoList = new ArrayList<>();
        aspectInfoList.add(new AspectInfo(3, new Mock1()));
        aspectInfoList.add(new AspectInfo(5, new Mock2()));
        aspectInfoList.add(new AspectInfo(2, new Mock3()));
        aspectInfoList.add(new AspectInfo(4, new Mock4()));
        aspectInfoList.add(new AspectInfo(1, new Mock5()));

        AspectListExecutor aspectListExecutor = new AspectListExecutor(AspectListExecutorTest.class, aspectInfoList);
        List<AspectInfo> sortAspectInfoList = aspectListExecutor.getSortedAspectInfoList();
        for (AspectInfo aspectInfo : sortAspectInfoList) {
            System.out.println(aspectInfo.getAspectObject().getClass().getName());
        }

    }

}
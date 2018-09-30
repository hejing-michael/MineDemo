package com.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MathUtilsTest {
    private IMathUtils mMathUtils;

    @Before
    public void setUp() throws Exception {
        mMathUtils = mock(IMathUtils.class);
    }

    @Test
    public void abs() {
        IMathUtils mathUtils = mock(IMathUtils.class); // 生成mock对象
        when(mathUtils.abs(-1)).thenReturn(1); // 当调用abs(-1)时，返回1
        int abs = mathUtils.abs(-1); // 输出结果 1
        Assert.assertEquals(abs, 1);// 测试通过
        // mathUtils.abs(-1)是否被调用过，否则不通过
        verify(mathUtils).abs(-1);
    }
}
package org.example.test_1Z0816.ch01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/16
     * 最後一次查看：2023/08/16
     * 題目考點：內部類
     * 需要補足知識：內部類
     * 複習：Notion <a href="https://www.notion.so/20f6214eaaaf49b0836bf5e8a20a82eb">...</a>
     * 總結：
     */
    public void test_q01() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/08/16
     * 最後一次查看：2023/08/16
     * 題目考點：內部類的實例化
     * 需要補足知識：內部類的實例化
     * 複習：Notion <a href="https://www.notion.so/20f6214eaaaf49b0836bf5e8a20a82eb">...</a>
     * 總結：
     */
    public void test_q02() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/08/16
     * 最後一次查看：2023/12/08
     * 題目考點：內部類的實例化
     * 需要補足知識：內部類的實例化
     * 複習：Notion <a href="https://www.notion.so/20f6214eaaaf49b0836bf5e8a20a82eb">...</a>
     *      查看q03
     * 總結：
     * 1.靜態內部類可以被實例化
     * 2.如果在當前外部類中實例化，不需要寫外部類的名字
     */
    public void test_q03() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/08/02
     * 最後一次查看：2023/12/08
     * 題目考點：內部類調用外部類
     * 需要補足知識：靜態內部類
     * 複習：查看 q04
     * 總結：
     * 1.靜態內部類，只能獲取外部類的靜態成員變量
     * 2.靜態內部類的private成員變量可以被外部類的其他內部類或是函數直接使用
     */
    public void test_q04() {
    }

    /**
     * 🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/08/17
     * 題目考點：靜態內部類
     * 需要補足知識：靜態內部類
     * 複習：查看 q05，補充看 Notion
     * 總結：非靜態內部類不能包含靜態成員
     */
    public void test_q05() {
    }

    /**
     * 🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：匿名內部類
     * 需要補足知識：匿名內部類使用
     * 複習：查看 q06
     * 總結：
     * 1.局部內部類使用外部類的成員變量是沒有問題的。
     * 2.局部內部類可以存取包含它的方法的final局部變數。在Java 8及以後，即使不明確地將變數宣告為 final，
     *   只要在方法中不再修改該變數，它在實際上仍然是 "effectively final"，並且局部內部類可以使用它。
     *   -> 但題目 value 被改變了值，這會使 value 不再是 "effectively final"，所以編譯器會報錯。
     */
    public void test_q06() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：匿名類
     * 需要補足知識：匿名類搭配var
     * 複習：查看 q07
     * 總結：
     * 1.匿名類不一定要是接口或是抽象類的子類，也可以給普通可實例化的類添加新方法（子類）
     * 2.var 搭配匿名類可以做到調用匿名對象新增的方法（var只能在方法內使用）
     */
    public void test_q07() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：匿名類
     * 需要補足知識：匿名類 構造器
     * 複習：查看 q08
     * 總結：
     * 1.不能在局部內部類中定義一個構造函數。局部內部類是基於正在繼承或實作的類別/接口的，所以沒有名稱，因此不能有一個明確的構造函數。
     * 2.如果需要給局部內部類初始化，可以使用代碼塊的方式。
     * 3.局部內部類的代碼塊執行順序在父類的構造器之後。
     * 4.局部內部類在Java中只能擴展一個類或實現一個介面。你不能同時擴展一個類和實現一個接口，也不能實現多個接口。
     */
    public void test_q08() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/10/25
     * 最後一次查看：2023/10/25
     * 題目考點：接口
     * 需要補足知識：接口默認方法，靜態方法
     * 複習：查看q09
     * 總結：靜態方法是跟著類或是接口的
     */
    public void test_q09() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：接口的默認方法
     * 需要補足知識：接口的繼承
     * 複習：查看 q11
     * 總結：
     * 1.接口的默認方法可以被繼承。
     * 2.如果父接口和祖父接口有相同名稱的方法，那麼只能調用接口的父默認方法，不能調用祖父的。
     * 3.如果父接口沒有和祖父接口相同名稱的方法，那麼可以調用祖父類的默認方法，語法是 A.super.test();
     *   需要注意的是雖然調用的是祖父方法，但這邊的A仍然是父接口
     * 4.會需要指定接口名稱，而不是像繼承直接寫super.test();的原因是 Java 允許多實現。
     */
    public void test_q11() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/08/17
     * 題目考點：多實現，繼承
     * 需要補足知識：實現了接口又繼承了父類，本質還是父類重寫了接口默認方法（當接口默認方法和父類方法名一樣且子類沒有重寫方法的情況）
     * 複習：查看 q13
     * 總結：
     * 1.當實現的接口和繼承的類有相同方法時: 如果一個類實現了一個接口且該接口有一個預設方法，同時該類也繼承了一個父類，
     *   且父類中有與該預設方法同名且參數列表相同的方法，那麼子類中的方法會覆蓋接口中的預設方法。這是因為類方法的優先級高於接口的預設方法。
     * 2.子類（或實現的類）覆蓋的方法的訪問修飾符應該提供相同或更大的訪問權限。
     *   例如，如果父類的方法是protected，那麼子類覆蓋的方法可以是protected或public，但不能是private。
     * 3.否則子類必須重寫方法: 如果接口的預設方法和父類的方法之間存在任何形式的不兼容（例如，返回類型不是協變的），那麼子類必須覆蓋該方法以解決歧義。
     */
    public void test_q13() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：Java 9 新特性
     * 需要補足知識：Java 9 新特性
     * 複習：查看 q14
     * 總結：
     * 1.接口中可以使用 private 權限修飾符（提供給默認方法使用）。
     * 2.私有方法也可以修飾為靜態。
     * 3.因為私有方法是給接口內部使用的，所以無法使用默認修飾符。
     */
    public void test_q14() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/08/17
     * 題目考點：枚舉
     * 需要補足知識：枚舉語法
     * 複習：查看 q15
     * 總結：枚舉類.values() 獲取枚舉數組，其他用法參照 q15
     */
    public void test_q15() {
    }

    /**
     * 🌟🌟🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/12/08
     * 題目考點：枚舉
     * 需要補足知識：枚舉
     * 複習：查看 q16
     * 總結：
     * 1.枚舉是個特殊的類，但也是 Object 的子類。
     * 2.枚舉不可以繼承，但可以實現。
     * 3.枚舉類的構造器必定為 private (可以不明寫)。
     * 4.枚舉也可以擁有多個構造器。
     */
    public void test_q16() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/08/17
     * 最後一次查看：2023/08/17
     * 題目考點：
     * 需要補足知識：
     * 複習：
     * 總結：
     */
    public void test_sample() {
    }
}







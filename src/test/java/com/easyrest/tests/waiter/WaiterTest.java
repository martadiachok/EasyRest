package com.easyrest.tests.waiter;

import com.easyrest.pages.WaiterPage;
import com.easyrest.tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class WaiterTest extends BaseTest {

    @Test
    public void verifyOrderExist() {

        //Given
        // ToDo Add sing in
        WaiterPage page = new WaiterPage(driver);

        //When
        Integer orderNumber = page.startRandomOrder();

        //Then
        assertTrue(page.verifyOrderMovedToInProgress(orderNumber));
    }
}

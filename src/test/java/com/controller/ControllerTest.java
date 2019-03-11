package com.controller;

import com.view.Messages;
import com.view.View;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

@Ignore("method has private modifier")
public class ControllerTest {
    private Controller controller;

    @Before
    public void initialization() {
        controller = Controller.getInstance();
    }

//    @Test
//    public void wrapCommandResponseWithBundlePositive() {
//        assertEquals(View.bundle.getString(Messages.TV_PLUG_IN),
//                controller.wrapCommandResponseWithBundle(Messages.TV_PLUG_IN));
//    }

//    @Test
//    public void wrapCommandResponseWithBundleNegative() {
//        assertEquals("320", controller.wrapCommandResponseWithBundle("320"));
//    }
}
package com.test.cg;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({AppTest.class, ContactMgrTest.class})
@SelectPackages("com.test.cg")
public class AllTests {
	
}

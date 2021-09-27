package com.search.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmptySearchTest.class, SearchNotFoundTest.class, SuccessfulSearchTest.class })
public class MyStoreTest {

}

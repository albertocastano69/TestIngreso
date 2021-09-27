package com.register.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmptyRegisterTest.class, PersonalInfoRegisterTest.class, SuccessfulRegisterTest.class })
public class RegisterTest {

}

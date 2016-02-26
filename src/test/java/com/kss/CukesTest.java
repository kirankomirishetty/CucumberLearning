/**
 * 
 */
package com.kss;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.model.CucumberBackground;

/**
 * @author kiran
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, tags = "@satish")
public class CukesTest {

}

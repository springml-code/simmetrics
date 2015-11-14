/*
 * #%L
 * Simmetrics Core
 * %%
 * Copyright (C) 2014 - 2015 Simmetrics Authors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * #L%
 */

package org.simmetrics.metrics;

import org.simmetrics.StringMetric;
import org.simmetrics.StringMetricTest;

@SuppressWarnings("javadoc")
public final class LongestCommonSubsequenceTest extends StringMetricTest {
	
	@Override
	protected boolean satisfiesSubadditivity() {
		return false;
	}
	
	@Override
	protected StringMetric getMetric() {
		return new LongestCommonSubsequence();
	}

	@Override
	protected T[] getStringTests() {
		return new T[] {

				new T(0.9167f, "test string1", "test string2"),
				new T(0.5000f, "test", "test string2"),
				new T(0.0000f, "", "test string2"),
				new T(0.8000f, "aaa bbb ccc ddd", "aaa bbb ccc eee"),
				new T(0.5714f, "aaa bbb", "aaa aaa"),
				new T(0.6000f, "aaa", "aaa aaa"),
				new T(0.8571f, "a b c d", "a b c e"),
				new T(0.7500f, "uxyw", "uyxw"),
				new T(0.6000f, "uxaayw", "uyxw"),
				new T(0.8889f, "transpose", "tranpsose"),
				new T(0.8333f, "Healed", "Sealed"),
				new T(0.6154f, "Healed", "Healthy"),
				new T(0.7273f, "Healed", "Heard"),
				new T(0.6667f, "Healed", "Herded"),
				new T(0.6000f, "Healed", "Help"),
				new T(0.4000f, "Healed", "Sold"),
				new T(0.6000f, "Healed", "Help"),
				new T(0.8125f, "Sam J Chapman", "Samuel John Chapman"),
				new T(0.9000f, "Sam Chapman", "S Chapman"),
				new T(0.4138f, "John Smith", "Samuel John Chapman"),
				new T(0.2857f, "John Smith", "Sam Chapman"),
				new T(0.2609f, "John Smith", "Sam J Chapman"),
				new T(0.2105f, "John Smith", "S Chapman"),
				new T(0.7463f, "Web Database Applications",
						"Web Database Applications with PHP & MySQL"),
				new T(0.6053f, "Web Database Applications",
						"Creating Database Web Applications with PHP and ASP"),
				new T(0.5714f, "Web Database Applications",
						"Building Database Applications on the Web Using PHP3"),
				new T(0.6250f, "Web Database Applications",
						"Building Web Database Applications with Visual Studio 6"),
				new T(0.4918f, "Web Database Applications",
						"Web Application Development With PHP"),
				new T(
						0.4464f,
						"Web Database Applications",
						"WebRAD: Building Database Applications on the Web with Visual FoxPro and Web Connection"),
				new T(0.2500f, "Web Database Applications",
						"Structural Assessment: The Role of Large and Full-Scale Testing"),
				new T(0.3158f, "Web Database Applications",
						"How to Find a Scholarship Online"),
				new T(0.5263f, "Web Aplications",
						"Web Database Applications with PHP & MySQL"),
				new T(0.4545f, "Web Aplications",
						"Creating Database Web Applications with PHP and ASP"),
				new T(0.3881f, "Web Aplications",
						"Building Database Applications on the Web Using PHP3"),
				new T(0.4286f, "Web Aplications",
						"Building Web Database Applications with Visual Studio 6"),
				new T(0.5490f, "Web Aplications",
						"Web Application Development With PHP"),
				new T(
						0.2941f,
						"Web Aplications",
						"WebRAD: Building Database Applications on the Web with Visual FoxPro and Web Connection"),
				new T(0.2051f, "Web Aplications",
						"Structural Assessment: The Role of Large and Full-Scale Testing"),
				new T(0.2553f, "Web Aplications",
						"How to Find a Scholarship Online"), };
	}
}

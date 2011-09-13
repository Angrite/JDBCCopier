package me.alabor.jdbccopier.copier.factory;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class FilterFactoryTest {

	@Test
	public void testCreateFilterList() {
		FilterFactory factory = new FilterFactory();
		String input = "this,is,a, test";
		List<String> list = factory.createFilterList(input);
		
		Assert.assertEquals(4, list.size());
		Assert.assertEquals("test", list.get(3));
	}

}

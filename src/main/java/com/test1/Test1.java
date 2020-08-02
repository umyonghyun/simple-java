package com.test1;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Test1 {

	final static public void main(String[] args) {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("test1");
		sampleList.add("test2");

		String targetString = sampleList.stream()
			.filter(sample -> StringUtils.equals(sample, "test2")).collect(joining());

		System.out.println(targetString);
	}
}

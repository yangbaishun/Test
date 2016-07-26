package com.meihuichina.test;

import com.meihuichina.webservice.PublishRoadConditionData;
import com.meihuichina.webservice.PublishRoadConditionDataService;

public class APP {
	public static void main(String[] args) {
		PublishRoadConditionDataService service = new PublishRoadConditionDataService();
		PublishRoadConditionData soap = service.getPublishRoadConditionDataPort();
		String strXml = soap.getRoadConditionDatas("", 0, "");
		System.out.println(strXml);
	}
}

package com.example;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.*;
import org.json.simple.parser.*;


public class ProgramOne {
    public void printOutPut() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/home/parag/Documents/my/career-starter-kit/java-example-demo/src/main/resources/person.json"));
            List<HashMap<String, Object>> jsonObject = (List<HashMap<String, Object>>) obj;
            for (HashMap<String, Object> singleData : jsonObject) {
                System.out.println(singleData.get("Children"));

            }
//            HashMap<String, Object> hashMapObj = (HashMap<String, Object>) jsonObject;
//            List<HashMap<String, Object>> jsonQuiz = (List<HashMap<String, Object>>) hashMapObj.get("medications");
//
//            for (HashMap<String, Object> singleData : jsonQuiz) {
//                for (Map.Entry<String, Object> entry : singleData.entrySet()) {
//                    String key = entry.getKey();
//                    Object value = entry.getValue();
//
//                    List<HashMap<String, Object>> jsonObj1 = (List<HashMap<String, Object>>) value;
//                    for (HashMap<String, Object> singleData1 : jsonObj1) {
//                        System.out.println("Question : " + singleData1.get("refills"));
//                    }
//                }
//            }


//            printQuestionAns(jsonQuiz, "maths", "q2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


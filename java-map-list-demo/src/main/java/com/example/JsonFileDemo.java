package com.example;

import java.io.FileReader;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class JsonFileDemo {

    public void testJsonFileRead() {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/home/parag/Documents/my/career-starter-kit/java-map-list-demo/src/main/resources/data.json"));
            JSONObject jsonObject = (JSONObject) obj;
            HashMap<String, Object> hashMapObj = (HashMap<String, Object>) jsonObject;
            List<HashMap<String, Object>> jsonQuiz = (List<HashMap<String, Object>>) hashMapObj.get("medications");

            for (HashMap<String, Object> singleData : jsonQuiz) {
                for (Map.Entry<String, Object> entry : singleData.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();

                    List<HashMap<String, Object>> jsonObj1 = (List<HashMap<String, Object>>) value;
                    for (HashMap<String, Object> singleData1 : jsonObj1) {
                        System.out.println("Question : " + singleData1.get("refills"));
                    }
                }
            }


//            printQuestionAns(jsonQuiz, "maths", "q2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printQuestionAns(HashMap<String, Object> jsonQuiz, String subject, String question) {
        HashMap<String, Object> jsonMaths = (HashMap<String, Object>) jsonQuiz.get(subject);
        HashMap<String, Object> jsonQ1 = (HashMap<String, Object>) jsonMaths.get(question);
        String jsonQuestion = (String) jsonQ1.get("question");
        String jsonAns = (String) jsonQ1.get("answer");

        System.out.println("Question : " + jsonQuestion);
        System.out.println("Answer : " + jsonAns);
    }

    public void printHashMap(Map<String, String> hashMapVal) {
        /* Display content using Iterator*/
        Set set = hashMapVal.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }

    public static void main(String[] args) {
        JsonFileDemo jsonFileDemo = new JsonFileDemo();
        jsonFileDemo.testJsonFileRead();
    }
}

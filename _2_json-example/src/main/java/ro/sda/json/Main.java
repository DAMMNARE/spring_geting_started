package ro.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Car c1 = new Car("Renault", "yellow", 100, true);

        // transforming from a pojo (plain old java obj)
        //into a json format is called SERIALIZATION
        String json = mapper.writeValueAsString(c1);
        System.out.println(json);
        System.out.println("-----------------------------------------");

        String jsonSerialized = "{\"brand\":\"Renault\",\"color\":\"yellow\",\"horsePower\":100,\"manual\":true}";

        Car deserializedFromJson = mapper.readValue(jsonSerialized, Car.class);
        System.out.println(deserializedFromJson);
    }
}

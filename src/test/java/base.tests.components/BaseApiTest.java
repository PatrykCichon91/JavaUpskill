package base.tests.components;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import test.enums.EndpointPath;

import java.util.HashMap;
import java.util.Map;

public class BaseApiTest {

    protected static Map<EndpointPath, String> endpointPaths;

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @BeforeAll
    static void  setUpEndpointPaths(){
        endpointPaths = new HashMap<>();
        endpointPaths.put(EndpointPath.Posts, "/posts");
        endpointPaths.put(EndpointPath.Comments, "/comments");
    }
}
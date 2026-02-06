import io.restassured.RestAssured;
import org.junit.Test;

public class GetPostsByIdTests {

    @Test
    public void  GetPostById(){
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts/1")
                .when()
                .get()
                .then()
                .statusCode(200);
    }
}

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.io.Console;

public class GetPostsCommentsTests extends BaseApiTest  {

    @Test
    public void getPostsComment(){
        RestAssured.given()
                .basePath("/comments")
                .queryParam("postId", 1)
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .body();
    }
}

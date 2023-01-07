import io.restassured.mapper.ObjectMapper;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    public void shouldCheckPostMethod() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body( "Размер возвращаемого значения равен 3") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Размер возвращаемого значения равен 3"))
        ;
    }

}

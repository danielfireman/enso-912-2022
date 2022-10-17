package app;

import io.jooby.JoobyTest;
import io.jooby.StatusCode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JoobyTest(App.class)
public class ApiTest {

  static OkHttpClient client = new OkHttpClient();

  @Test
  public void testRaiz(int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/raiz/4")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals("2.0", rsp.body().string());
      assertEquals(StatusCode.OK.value(), rsp.code());
    }
  }

  @Test
  public void testRaizFalha(int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/raiz/aa")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals(StatusCode.BAD_REQUEST.value(), rsp.code());
    }
  }
}

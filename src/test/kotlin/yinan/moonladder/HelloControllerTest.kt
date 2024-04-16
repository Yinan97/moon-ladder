package yinan.moonladder

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest{
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun testHelloWorld() {
        mockMvc.perform(get("/hello-kotlin"))
            .andExpect(status().isOk)
            .andExpect(content().string("Hello World!"))
    }
}

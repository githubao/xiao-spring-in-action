package me.xiao.springlearn.ch05;


import me.xiao.springlearn.ch05.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * web app test
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 16:00
 */

public class WebappTest {

    @Test
    public void testWeb() throws Exception {
        HomeController homeController = new HomeController();

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));

    }

}
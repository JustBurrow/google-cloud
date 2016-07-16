/**
 *
 */
package kr.lul.study.googlecloud.computeengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since 2016. 7. 16.
 * @author Just Burrow just.burrow@lul.kr
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
  @RequestMapping("/")
  @ResponseBody
  public String home() {
    return "Hello Google Compute Engine!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SampleController.class, args);
  }
}
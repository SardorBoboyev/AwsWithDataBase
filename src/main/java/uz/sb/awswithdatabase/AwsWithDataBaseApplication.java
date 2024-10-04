package uz.sb.awswithdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsWithDataBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsWithDataBaseApplication.class, args);
    }


    @GetMapping("/aws")
    public String aws() {
        return "This is my final aws, also connected to the database. I've finished";
    }
}

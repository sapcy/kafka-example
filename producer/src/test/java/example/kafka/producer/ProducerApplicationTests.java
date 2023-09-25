package example.kafka.producer;

import example.kafka.producer.app.SampleProducer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProducerApplicationTests {

    private static final SampleProducer sampleProducer = new SampleProducer();
    @Test
    void send() {
        sampleProducer.send("sample message");
    }

}

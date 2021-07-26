package vacunacion;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

class VacunacionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test()
    public void testMain() throws IOException, InterruptedException {
        var in = "mayra\n123\n-1";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        VacunacionApplication.main(null);
    }

    @Test()
    public void testMain2() throws IOException, InterruptedException {
        var in = "mayra\n123\n1\n-1";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        VacunacionApplication.main(null);
    }

    @Test()
    public void testMain3() throws IOException, InterruptedException {
        var in = "mayra\n123\n2\n-1";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        VacunacionApplication.main(null);
    }
}

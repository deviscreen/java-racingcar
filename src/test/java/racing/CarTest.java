package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;
    @BeforeEach
    void setup(){
        car =  new Car();
    }


    @DisplayName(" 한번 시도 했을경우  ")
    @ParameterizedTest
    @CsvSource( value = {"2,2", "4,4", "9,9"}, delimiter = ',')
    void run( String meter, String resultMeter) {
            assertThat(car.run(Integer.parseInt(meter))).isEqualTo(Integer.parseInt(resultMeter));
    }

    @DisplayName(" 두 번 시도 했을 경우")
    @Test
    void secondTryRun(){
        int firstTime = car.run(2);
        int secondTime = car.run(7);
        assertThat(car.totalMeter()).isEqualTo(9);
    }


}
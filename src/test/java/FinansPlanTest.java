import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.finansalPlan.services.FinansPlan;

public class FinansPlanTest {
    FinansPlan service = new FinansPlan();
    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/main/resources/vacation.csv")
    public void vacationDaysCalculation(int expected, int income,int expenses,int threshold) {

        int actual = service.calculate(income,expenses,threshold);

        Assertions.assertEquals(expected, actual);

    }
}


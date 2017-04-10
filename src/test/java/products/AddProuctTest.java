package products;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by rahul.kulkarni on 04/04/2017.
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/AddProucts.feature"},
tags = {"@test"})
public class AddProuctTest {


}

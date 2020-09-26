package stepDefinations;

import cucumber.api.java.en.Given;

public class StepDefination {

    @Given("^statement to print$")
    public void statement_to_print() throws Throwable {
        System.out.println("This is my first command");
        System.out.println("This is my second command added by Nidhi");
        System.out.println("this is second time change anita");
}
}
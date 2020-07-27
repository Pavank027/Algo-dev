package BalanceParan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ParaenthesisBalanceTest {

    @Test
    public void TestAreParanthesisBalancedWhenIncorrectInput() {
        assertFalse(ParaenthesisBalance.areParanthesisBalanced("]$["));
        assertFalse(ParaenthesisBalance.areParanthesisBalanced("[[[]]"));
        assertFalse(ParaenthesisBalance.areParanthesisBalanced("["));
    }

    @Test
    public void TestAreParanthesisBalancedWhenBalancedInput() {
        assertTrue(ParaenthesisBalance.areParanthesisBalanced("$]"));
        asserTrue(ParaenthesisBalance.areParanthesisBalanced("[$]$"));
        asserTrue(ParaenthesisBalance.areParanthesisBalanced("$[]$"));
    }

}
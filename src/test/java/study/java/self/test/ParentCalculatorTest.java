package study.java.self.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import study.java.self.test.resolver.RandomParameterResolver;

@Extensions(
    @ExtendWith(RandomParameterResolver.class)
)
public class ParentCalculatorTest {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }
}

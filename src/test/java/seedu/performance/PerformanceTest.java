package seedu.performance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformanceTest {
    Performance performanceGradeTestUnit = new Performance("John", "A");
    Performance performanceMarkTestUnit = new Performance("Li Ming", "100");
    Performance performanceNumericNameTestUnit = new Performance("123", "No result");

    @Test
    void getStudent() {
        assertEquals("John", performanceGradeTestUnit.getStudent());
        assertEquals("Li Ming", performanceMarkTestUnit.getStudent());
    }

    @Test
    void getResult() {
    }

    @Test
    void testToString() {
    }
}
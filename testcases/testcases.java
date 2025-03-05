import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testcases {
    @Test
    public void testCorrectAssign() {
        Task task=new Task();
        String assigneee="emp1";
        Task.setAssignee(assigneee);
        assertEquals(Task.getAssignee(),assigneee);
    }
    @Test
    public void testCorrectSatus() {
        Task task=new Task();
        int testStaus=1;
        Task.updateStatus(testStaus);
        assertEquals(Task.getStatus(),"open");
    }

    @Test
    public void testDuedate() {
        Task task=new Task();
        String testduedate ="11/02/2024";
        Task.setDuedate(testduedate);
        assertTrue(Task.isDue(testduedate));
    }

}
